package com.leduytuanvu.smarthome.data.model

import android.app.Notification
import android.service.notification.Condition

data class Automation(
    val id: String,
    val name: String,
    val description: String,
    val devices: List<Device>,
    val conditions: List<Condition>,
    val actions: List<Notification.Action>
)