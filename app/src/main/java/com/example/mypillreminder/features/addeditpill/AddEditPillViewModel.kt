package com.example.mypillreminder.features.addeditpill

import android.app.AlarmManager
import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.mypillreminder.util.convertHourToMillisecond
import com.example.mypillreminder.util.getNextYear
import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.service.repository.PillRepository
import com.example.mypillreminder.util.AlarmUtil
import kotlinx.coroutines.launch

class AddEditPillViewModel(private val repository: PillRepository, private val pillIdentifier: String?, val app: Application) : AndroidViewModel(app) {

    private lateinit var editablepill: Pill
    private val alarmManager = app.getSystemService(Context.ALARM_SERVICE) as AlarmManager

    companion object {
        private const val TAG = "AddEditPillViewModel"
    }


    val _titleEditText = MutableLiveData<String>() //2-way binding


    private val _startDate = MutableLiveData<Long>()
    val startDate: LiveData<Long>
        get() = _startDate

    val _startDateFormatted = MutableLiveData<String>()


    private val _interval = MutableLiveData<Int>()
    val interval: LiveData<Int>
        get() = _interval

    val _switchReminder = MutableLiveData<Boolean>() //2-way binding

    private val _imagePath = MutableLiveData<String>()
    val imagePath: LiveData<String>
        get() = _imagePath

    init {
        initializeReminder()
    }

    fun initializeReminder() {
        viewModelScope.launch {
            if (pillIdentifier != null) {
                editablepill = repository.getPillByIdentifier(pillIdentifier) ?: Pill()

            } else {
                editablepill = Pill()
            }
            Log.d(TAG, "showlog: identifier is ${editablepill.pillIdentifier}")
            updateUI()
        }
    }

    fun updateUI() {

        _titleEditText.value = editablepill.pillName
        _interval.value = editablepill.interval
        _startDate.value = editablepill.startTime
        _switchReminder.value = editablepill.hasReminder
        _imagePath.value = editablepill.pillImage

//        _startDateFormatted.value = editablepill.startTimeFormatted()
//        _dateText.value = editableReminder.date
//        _timeText.value = editableReminder.time
//        _repeatIntervalText.value = editableReminder.repeatValue.toString()
//        _repeatIntervalUnitText.value = editableReminder.repeatUnit
    }


    fun onImageDeleteClicked(){
        setImagePath("")
    }

    private val _navigateToHome = MutableLiveData<Boolean?>()
    val navigateToHome: LiveData<Boolean?>
        get() = _navigateToHome

    fun onCancelClicked() {
        Log.i("MYTAG", "onCancelClicked")
        _navigateToHome.value = true
    }

    fun doneNavigating() {
        _navigateToHome.value = null
    }


    fun setInterval(interval: Int) {
        _interval.value = interval
    }

    private val _openChooseDate = MutableLiveData<Boolean?>()
    val openChooseDate: LiveData<Boolean?>
        get() = _openChooseDate

    fun onChooseDateClicked() {
        Log.i("MYTAG", "onChooseDateClicked")
        _openChooseDate.value = true
    }

    fun doneChooseDate() {
        _openChooseDate.value = null
    }

    fun setStartDate(startDateTime: Long) {
        _startDate.value = startDateTime
//       _startDateFormatted.value = editablepill.getDateFormatted(startDateTime)
    }


    private val _openChooseImage = MutableLiveData<Boolean?>()
    val openChooseImage: LiveData<Boolean?>
        get() = _openChooseImage

    fun doneChooseImage() {
        _openChooseImage.value = null
    }

    fun onSelectImageClicked() {
        _openChooseImage.value = true
    }

    fun setImagePath(picturePath: String) {
        _imagePath.value = picturePath
//        binding.uploadProfilePictureImageView.setImageURI(data?.data)
    }

    fun onSaveClicked() {
        checkBeforeInsert()
    }

    fun updateReminder() {
        editablepill.apply {

            pillName = _titleEditText.value!!
            interval = _interval.value!!
            startTime = _startDate.value!!
            hasReminder = _switchReminder.value!!
            pillImage = _imagePath.value!!
            nextDose = startTime.plus(convertHourToMillisecond(interval))
            endTime = getNextYear(startTime)

        }
    }

    private fun checkBeforeInsert() {

        if (_titleEditText.value.isNullOrEmpty()) {
//            _snackBarEvent.value = Event(app.getString(R.string.snackbartext_emptyReminder))
        } else {

            updateReminder()

            viewModelScope.launch {
                if (pillIdentifier == null) {
                    repository.insert(editablepill)
                    editablepill = repository.getLatestReminder()!!
                } else {
                    repository.update(editablepill)
                    cancelExistingAlarm()
                }
                createReminderAlarm()
                _navigateToHome.value = true
            }
        }

    }

    fun cancelExistingAlarm() {
        AlarmUtil.cancelAlarm(app.applicationContext, editablepill, alarmManager)
    }

    fun createReminderAlarm() {
        if (editablepill.hasReminder) {
            Log.i("MYTAG", "createReminderAlarm")
            AlarmUtil.createAlarm(app.applicationContext, editablepill, alarmManager)
        }
    }

}







