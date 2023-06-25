package com.leduytuanvu.smarthome.data.model

data class Device(
    val id: String,
    val name: String,
    val type: DeviceType,
    val status: DeviceStatus,
    val room: Room
)

enum class DeviceType {
    LIGHT,
    THERMOSTAT,
    LOCK,
    CAMERA,
    // Add more device types as needed
}

enum class DeviceStatus {
    ON,
    OFF
}