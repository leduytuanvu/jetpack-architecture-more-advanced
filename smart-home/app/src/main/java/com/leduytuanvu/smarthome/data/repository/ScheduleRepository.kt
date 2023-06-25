package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.Schedule

class ScheduleRepository {
    private val schedules: MutableList<Schedule> = mutableListOf()

    fun getAllSchedules(): List<Schedule> {
        return schedules.toList()
    }

    fun getScheduleById(id: String): Schedule? {
        return schedules.find { it.id == id }
    }

    fun addSchedule(schedule: Schedule) {
        schedules.add(schedule)
    }

    fun updateSchedule(schedule: Schedule) {
        val index = schedules.indexOfFirst { it.id == schedule.id }
        if (index != -1) {
            schedules[index] = schedule
        }
    }

    fun deleteSchedule(schedule: Schedule) {
        schedules.remove(schedule)
    }
}