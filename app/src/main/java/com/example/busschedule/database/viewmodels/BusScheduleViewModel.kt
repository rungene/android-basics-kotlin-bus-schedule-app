package com.example.busschedule.database.viewmodels

import androidx.lifecycle.ViewModel
import com.example.busschedule.database.schedule.ScheduleDao

class BusScheduleViewModel(private val scheduleDao: ScheduleDao): ViewModel() {}
