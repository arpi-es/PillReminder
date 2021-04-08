package com.example.mypillreminder.service.repository

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.mypillreminder.service.model.Pill

private const val PILLS_DB_NAME = "pill_database"

@Database(entities = [Pill::class], version = 1, exportSchema = false)
abstract class PillDatabase : RoomDatabase() {

    abstract val pillDao: PillDao

    companion object {
        fun getInstance(context: Context): PillDatabase = Room.databaseBuilder(
            context.applicationContext,
            PillDatabase::class.java, PILLS_DB_NAME
        ).fallbackToDestructiveMigration().build()
    }

//    abstract fun pillDao(): PillDao
//    companion object {
//        private var instance: PillDatabase? = null
//
////        fun getInstance(context: Context): PillDatabase? {
////            if (instance == null) {
////                synchronized(PillDatabase::class) {
////                    instance = Room.databaseBuilder(
////                        context.applicationContext,
////                        PillDatabase::class.java, PILLS_DB_NAME
////                    )
////                        .fallbackToDestructiveMigration() // when version increments, it migrates (deletes db and creates new) - else it crashes
////                        .addCallback(roomCallback)
////                        .build()
////                }
////            }
////            return instance
////        }
//
//        fun destroyInstance() {
//            instance = null
//        }
//
//        private val roomCallback = object : RoomDatabase.Callback() {
//            override fun onCreate(db: SupportSQLiteDatabase) {
//                super.onCreate(db)
//                PopulateDbAsyncTask(instance)
//                    .execute()
//            }
//        }
//    }


//    class PopulateDbAsyncTask(db: PillDatabase?) : AsyncTask<Unit, Unit, Unit>() {
//        private val pillDao = db?.pillDao()
//
//        override fun doInBackground(vararg p0: Unit?) {
//
//
//            val startTime: Long = System.currentTimeMillis()
//            val nextDose: Long = startTime.plus(convertHourToMillisecond(5))
//            val endTime: Long = startTime + DateUtils.WEEK_IN_MILLIS
//            val lastTaken: Long = 0L
//
//
//            val pill = Pill("coldstop", "Test", 5, false, startTime, nextDose, endTime, lastTaken)
//
//            pillDao?.insert(pill)
//
//            pill.pillName = "Gelophen"
//
//            pillDao?.insert(pill)
//        }
//    }
}