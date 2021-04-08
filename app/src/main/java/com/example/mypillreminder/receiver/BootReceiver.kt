package com.example.mypillreminder.receiver

import android.app.AlarmManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.service.repository.PillRepository
import com.example.mypillreminder.util.AlarmUtil
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import org.koin.core.KoinComponent
import org.koin.core.inject

class BootReceiver : BroadcastReceiver(), KoinComponent {
    private var pills: List<Pill>? = null

    companion object {
        private const val TAG = "BootReceiver"
    }


    override fun onReceive(context: Context?, intent: Intent?) {
        //@ this stage all reminders are cancelled
        //we need to create alarms for each reminder that was active
        intent?.let {
            Log.d(TAG, "onReceive: intent not null ")
            if (intent.action == "android.intent.action.BOOT_COMPLETED") {
                Log.d(TAG, "onReceive: intent action is correct")
                val alarmManager = context!!.getSystemService(Context.ALARM_SERVICE) as AlarmManager
                val repository: PillRepository by inject()
                CoroutineScope(Dispatchers.Main).launch {
                    pills = repository.getPillsList()
                    Log.d(TAG, "reminders ${pills}")
                    val listOfPills = pills //Read, so we can smartCast
                    if (!listOfPills.isNullOrEmpty()) {
                        listOfPills.forEach { pill ->
                            if (pill.hasReminder) {
                                AlarmUtil.createAlarm(context.applicationContext, pill, alarmManager)
                            }
                        }
                    }
                }
            }
        }
    }
}