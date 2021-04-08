package com.example.mypillreminder.features.home

import android.app.AlarmManager
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.*
import com.example.mypillreminder.util.convertHourToMillisecond
import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.service.repository.PillRepository
import com.example.mypillreminder.util.AlarmUtil
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: PillRepository, val app: Application) : AndroidViewModel(app) {

    companion object {
        private const val TAG = "HomeViewModel"
    }

    private val alarmManager = app.getSystemService(Context.ALARM_SERVICE) as AlarmManager
    val pills = repository.getAllPills()
//    val isEmpty = Transformations.map(pills) {
//        it.isEmpty()
//    }

    private fun updatePill(pill: Pill) {
        viewModelScope.launch {
            repository.update(pill)
            updateAlarm(pill)
        }
    }

    private fun deletePill(pill: Pill) {
        viewModelScope.launch {
            repository.delete(pill)
            cancelExistingAlarm(pill)
        }
    }


    private fun updateAlarm(pill: Pill) {
        if (pill.hasReminder) {
            createReminderAlarm(pill)
        } else {
            cancelExistingAlarm(pill)
        }
    }


    private fun createReminderAlarm(pill: Pill) {
        AlarmUtil.createAlarm(app.applicationContext, pill, alarmManager)
        Log.d(TAG, "createReminderAlarm: ${pill.id}")
    }

    private fun cancelExistingAlarm(pill: Pill) {
        AlarmUtil.cancelAlarm(app.applicationContext, pill, alarmManager)
        Log.d(TAG, "cancelExistingAlarm: ${pill.id}")
    }


    private val _navigateToAddPill = MutableLiveData<Boolean?>()

    val navigateToAddPill: LiveData<Boolean?>
        get() = _navigateToAddPill

    fun onAddPill() {
        _navigateToAddPill.value = true
    }

    fun doneNavigating() {
        _navigateToAddPill.value = null
    }


    fun onTakeClicked(pill: Pill) {
        pill.lastTaken = System.currentTimeMillis()
        pill.nextDose = pill.lastTaken.plus( getDurationToNextDose(pill.interval) )
        updatePill(pill)
    }

    fun onSkipClick(pill: Pill) {
        pill.nextDose = pill.nextDose.plus( getDurationToNextDose(pill.interval) )
        updatePill(pill)
    }

    private fun getDurationToNextDose(interval: Int) : Long{
        return convertHourToMillisecond(interval)
    }

    private var _selectedPill = Pill()
    private val _openChooseDate = MutableLiveData<Boolean?>()
    val openChooseDate: LiveData<Boolean?>
        get() = _openChooseDate

    fun onAlreadyTakenClick(pill: Pill) {
        Log.i("MYTAG", "onChooseDateClicked")
        _selectedPill = pill.copy()
        _openChooseDate.value = true
    }

    fun doneChooseDate() {
        _openChooseDate.value = null
    }

    fun setLastTakenDate(lastTakenDateTime: Long) {
        _selectedPill.lastTaken = lastTakenDateTime
        _selectedPill.nextDose = _selectedPill.lastTaken.plus( getDurationToNextDose(_selectedPill.interval) )
        updatePill(_selectedPill)
    }


    fun onItemSwiped(pill: Pill){
        deletePill(pill)
    }

    fun onDeleteClicked(pill: Pill){
        deletePill(pill)
    }
    fun onCardClick(pill: Pill) {
        _navigateToAddPill.value = true
    }

}
