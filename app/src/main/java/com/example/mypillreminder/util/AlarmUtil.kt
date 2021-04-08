package com.example.mypillreminder.util

import android.app.AlarmManager
import android.content.ComponentName
import android.content.Context
import android.content.pm.PackageManager
import android.os.SystemClock
import android.util.Log
import androidx.core.app.AlarmManagerCompat
import com.example.mypillreminder.receiver.AlarmReceiver
import com.example.mypillreminder.receiver.BootReceiver
import com.example.mypillreminder.service.model.Pill
import java.text.SimpleDateFormat
import java.util.*

class AlarmUtil {
    companion object {
        private const val TAG = "AlarmUtil"

        private fun getTriggerTime(alarmTimeInMills : Long): Long {
//            val date = SimpleDateFormat("EEE, d MMM yyyy").parse(dateString)
//            val time = SimpleDateFormat("h:mm a").parse(timeString)
//            val calendar = Calendar.getInstance()
//            calendar.time = date ?: Date()
//            val initialYear = calendar.get(Calendar.YEAR)
//            val initialMonth = calendar.get(Calendar.MONTH)
//            val initialDate = calendar.get(Calendar.DAY_OF_MONTH)
//            calendar.time = time ?: Date()
//            val initialHourOfDay = calendar.get(Calendar.HOUR_OF_DAY)
//            val initialMinute = calendar.get(Calendar.MINUTE)
//            calendar.set(initialYear, initialMonth, initialDate, initialHourOfDay, initialMinute)
            val timeDiff = alarmTimeInMills - Calendar.getInstance().timeInMillis
            return SystemClock.elapsedRealtime() + timeDiff
        }

        private fun getRepeatTime(value: Int, unit: String): Long {
            return when (unit) {
                "Minute" ->
                    value * millisMinute
                "Hour" ->
                    value * millisHour
                "Day" ->
                    value * millisDay
                "Week" ->
                    value * millisWeek
                "Month" ->
                    value * millisMonth
                else ->
                    value * millisDay
            }
        }

        fun createAlarm(context: Context, pill: Pill, alarmManager: AlarmManager)
        {
            val alarmPendingIntent = AlarmReceiver.getAlarmPendingIntent(context, pill)

//            if (pill.repeat) {
//                alarmManager.setRepeating(
//                    AlarmManager.ELAPSED_REALTIME_WAKEUP,
//                    getTriggerTime(reminder.date, reminder.time),
//                    getRepeatTime(reminder.repeatValue, reminder.repeatUnit),
//                    alarmPendingIntent
//                )
//            } else {
                AlarmManagerCompat.setExactAndAllowWhileIdle(
                    alarmManager,
                    AlarmManager.ELAPSED_REALTIME_WAKEUP,
                    getTriggerTime(pill.nextDose),
                    alarmPendingIntent
                )
//            }
            updateAlarmWhenReboot(context, PackageManager.COMPONENT_ENABLED_STATE_ENABLED)
        }

        fun cancelAlarm(context: Context, pill: Pill, alarmManager: AlarmManager)
        {
            val alarmPendingIntent = AlarmReceiver.getAlarmPendingIntent(context, pill)

            Log.d(TAG, "cancelAlarm: ")
            alarmManager.cancel(alarmPendingIntent)
            updateAlarmWhenReboot(context, PackageManager.COMPONENT_ENABLED_STATE_DISABLED)
        }


        private fun updateAlarmWhenReboot(context: Context, state: Int) {
            val receiver = ComponentName(context, BootReceiver::class.java)
            context.packageManager.setComponentEnabledSetting(receiver, state, PackageManager.DONT_KILL_APP)
        }
    }
}