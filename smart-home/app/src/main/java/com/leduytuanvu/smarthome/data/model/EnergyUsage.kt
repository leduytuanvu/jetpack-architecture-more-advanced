package com.leduytuanvu.smarthome.data.model

import java.util.Date

data class EnergyUsage(
    val id: String,
    val device: Device,
    val powerConsumption: Float,
    val timestamp: Date
)