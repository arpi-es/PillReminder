package com.example.mypillreminder.receiver

import android.app.NotificationManager
import android.app.PendingIntent
import android.app.PendingIntent.FLAG_UPDATE_CURRENT
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import android.util.Log
import androidx.core.app.NotificationCompat
import androidx.core.content.ContextCompat
import com.example.mypillreminder.R
import com.example.mypillreminder.service.model.Pill
import com.example.mypillreminder.util.INTENT_EXTRA_REMINDER_IDENTIFIER
import com.example.mypillreminder.util.INTENT_EXTRA_ROW_ID
import com.example.mypillreminder.util.INTENT_EXTRA_TITLE
import com.example.mypillreminder.view.ui.MainActivity

class AlarmReceiver:BroadcastReceiver(){

    override fun onReceive(context: Context?, intent: Intent?) {
        //notification Extras..
        val notificationId = intent?.extras?.getInt(INTENT_EXTRA_ROW_ID)?:0
        val reminderIdentifier = intent?.extras?.getString(INTENT_EXTRA_REMINDER_IDENTIFIER)
        val title = intent?.extras?.getString(INTENT_EXTRA_TITLE)

        val notificationIntent = Intent(context, MainActivity::class.java)
        notificationIntent.putExtra(INTENT_EXTRA_REMINDER_IDENTIFIER,reminderIdentifier)
        val pendingIntent = PendingIntent.getActivity(context,notificationId,notificationIntent,FLAG_UPDATE_CURRENT)

        val notificationBuilder = NotificationCompat.Builder(context!!,context.getString(R.string.reminder_notification_channel_id))
            .setLargeIcon(BitmapFactory.decodeResource(context.resources,R.mipmap.ic_launcher))
            .setSmallIcon(R.drawable.ic_notifications)
            .setContentTitle(title)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .setOnlyAlertOnce(true)
            .setPriority(NotificationCompat.PRIORITY_HIGH)

        val notificationManager = ContextCompat.getSystemService(context,NotificationManager::class.java) as NotificationManager
        notificationManager.notify(notificationId,notificationBuilder.build())

    }

    companion object {

        private const val TAG = "AlarmReceiver"

        fun getAlarmPendingIntent(pckgContext: Context, pill: Pill): PendingIntent {
            val intent = Intent(pckgContext, AlarmReceiver::class.java)
            intent.apply {
                putExtra(INTENT_EXTRA_REMINDER_IDENTIFIER, pill.pillIdentifier)
                putExtra(INTENT_EXTRA_ROW_ID, pill.id)
                putExtra(INTENT_EXTRA_TITLE, pckgContext.getString(R.string.notif_prefix).plus( pill.pillName) )

            }

            val pendingIntent = PendingIntent.getBroadcast(
                pckgContext,
                pill.id,
                intent,
                PendingIntent.FLAG_CANCEL_CURRENT
            )
            Log.d(TAG, "getAlarmPendingIntent: ${pill.id}")
            return pendingIntent
        }


    }

}