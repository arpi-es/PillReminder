package com.example.mypillreminder.service.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.mypillreminder.R
import com.example.mypillreminder.util.getPersianDate
import java.util.*


import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.graphics.Color
import android.os.Build
import android.provider.Settings.Global.getString
import androidx.core.content.ContextCompat
import com.example.mypillreminder.features.addeditpill.AddEditPillViewModel
import com.example.mypillreminder.features.home.HomeViewModel
import com.example.mypillreminder.service.repository.PillDatabase
import com.example.mypillreminder.service.repository.PillRepository
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.context.startKoin
import org.koin.dsl.module

@Entity(tableName = "tblPills")
data class Pill(

    @ColumnInfo(name = "_id")
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val pillIdentifier: String = UUID.randomUUID().toString(),
    var pillName: String = "",
    var pillImage: String = "",
    var interval: Int = 6,
    var hasReminder: Boolean = false,
    var startTime: Long = System.currentTimeMillis(),
    var nextDose: Long = 0L,
    var endTime: Long = 0L,
    var lastTaken: Long = 0L, )
{

    fun lastTakenFormatted() = if (lastTaken == 0L) {"استفاده نشده"} else { getPersianDate(lastTaken) }
    fun nextDoseFormatted() = getPersianDate(nextDose)

}

 