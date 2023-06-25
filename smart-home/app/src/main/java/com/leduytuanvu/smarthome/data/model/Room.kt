package com.leduytuanvu.smarthome.data.model

data class Room(
    val id: String,
    val name: String,
    val devices: List<Device>,
    val temperature: Float,
    val humidity: Float
)