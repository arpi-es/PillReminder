package com.example.mypillreminder.service.repository

import android.content.Context
import android.provider.CalendarContract
import android.util.Log
import androidx.lifecycle.LiveData
import com.example.mypillreminder.service.model.Pill
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class PillRepository( private val pillDao : PillDao, private val context: Context) {

    fun getAllPills() = pillDao.getPills()

    suspend fun getPillsList():List<Pill>?{
        return withContext(Dispatchers.IO){
            pillDao.getPillsList()
        }
    }

    suspend fun getPillByIdentifier(identifier: String): Pill? {
        return withContext(Dispatchers.IO) {
            pillDao.getPillByIdentifier(identifier)
        }
    }

    suspend fun getLatestReminder(): Pill? {
        return  withContext(Dispatchers.IO){
            pillDao.getLatestPill()
        }
    }

    suspend fun insert(pill: Pill){
        withContext(Dispatchers.IO) {
            pillDao.insert(pill)
        }
    }

    suspend fun update(pill: Pill) {
        withContext(Dispatchers.IO) {
            pillDao.update(pill)
        }
    }

    suspend fun delete(pill: Pill) {
        withContext(Dispatchers.IO) {
            pillDao.delete(pill)
        }
    }

    fun deleteAllPill() {
        CoroutineScope(Dispatchers.IO).launch {
            pillDao.deleteAllPills()
        }

    }

}