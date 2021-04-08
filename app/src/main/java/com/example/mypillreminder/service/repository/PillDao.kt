package com.example.mypillreminder.service.repository

import android.provider.CalendarContract
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.mypillreminder.service.model.Pill

@Dao
interface PillDao {

    @Insert
    fun insert(pill: Pill)

    @Update
    fun update(pill: Pill)

    @Delete
    fun delete(pill: Pill)

    @Query("Delete from tblPills")
    fun deleteAllPills()

    @Query("SELECT * FROM tblPills ORDER BY _id Desc")
    fun getPills() : LiveData<List<Pill>>


    @Query("SELECT * FROM tblPills ORDER BY _id Desc")
    fun getPillsList():List<Pill>?


    @Query("SELECT * FROM tblPills WHERE _id=:pillID")
    fun getPillById(pillID: Int):  LiveData<Pill?>

    @Query("SELECT * FROM tblPills WHERE pillIdentifier = :pillIdentifier")
    suspend fun getPillByIdentifier(pillIdentifier:String): Pill?


    @Query("SELECT * FROM tblPills ORDER BY _id DESC LIMIT 1")
    suspend fun getLatestPill(): Pill?

}