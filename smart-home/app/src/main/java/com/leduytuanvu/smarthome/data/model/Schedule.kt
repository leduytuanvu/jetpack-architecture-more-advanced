package com.leduytuanvu.smarthome.data.model

import java.time.DayOfWeek

data class Schedule(
    val id: String,
    val name: String,
    val startTime: String,
    val endTime: String,
    val repeatDays: List<DayOfWeek>,
    val devices: List<Device>
)