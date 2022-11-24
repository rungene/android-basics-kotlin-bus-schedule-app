package com.example.busschedule.database

import androidx.room.RoomDatabase
import com.example.busschedule.database.schedule.ScheduleDao

abstract class AppDatabase: RoomDatabase() {
    abstract fun scheduleDao(): ScheduleDao

    companion object {
    }


}
