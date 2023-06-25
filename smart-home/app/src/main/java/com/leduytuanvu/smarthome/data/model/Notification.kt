package com.leduytuanvu.smarthome.data.model

import java.util.Date

data class Notification(
    val id: String,
    val title: String,
    val message: String,
    val timestamp: Date
)