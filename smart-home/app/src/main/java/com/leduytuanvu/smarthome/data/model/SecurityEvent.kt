package com.leduytuanvu.smarthome.data.model

import java.util.Date

data class SecurityEvent(
    val id: String,
    val name: String,
    val type: SecurityEventType,
    val timestamp: Date
)

enum class SecurityEventType {
    INTRUSION,
    FIRE,
    // Add more security event types as needed
}