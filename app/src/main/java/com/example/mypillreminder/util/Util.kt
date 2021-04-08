package com.example.mypillreminder.util

import android.annotation.SuppressLint
import android.util.Log
import saman.zamani.persiandate.PersianDate
import java.text.SimpleDateFormat
import java.util.*
import java.util.concurrent.TimeUnit

@SuppressLint("SimpleDateFormat")
fun convertLongToDateString(systemTime: Long): String {
    return SimpleDateFormat("EEEE MMM-dd-yyyy' Time: 'HH:mm")
        .format(systemTime).toString()
}

fun convertHourToMillisecond(hour: Int) : Long{
    val minutes = hour * 60
     return  TimeUnit.MINUTES.toMillis(minutes.toLong())
}

fun getNextYear(startDate: Long): Long {

    val date = Date(startDate)
    val cal = Calendar.getInstance()
    cal.time = date
    cal.add(Calendar.YEAR, 1)
    return cal.timeInMillis
}

fun getPersianDate(lDate: Long): String {
    val date = Date(lDate)
    val pDate = PersianDate(date)
    return pDate.toString()
}
