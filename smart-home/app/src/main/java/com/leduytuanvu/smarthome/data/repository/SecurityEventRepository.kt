package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.SecurityEvent

class SecurityEventRepository {
    private val securityEvents: MutableList<SecurityEvent> = mutableListOf()

    fun getAllSecurityEvents(): List<SecurityEvent> {
        return securityEvents.toList()
    }

    fun getSecurityEventById(id: String): SecurityEvent? {
        return securityEvents.find { it.id == id }
    }

    fun addSecurityEvent(securityEvent: SecurityEvent) {
        securityEvents.add(securityEvent)
    }

    fun updateSecurityEvent(securityEvent: SecurityEvent) {
        val index = securityEvents.indexOfFirst { it.id == securityEvent.id }
        if (index != -1) {
            securityEvents[index] = securityEvent
        }
    }

    fun deleteSecurityEvent(securityEvent: SecurityEvent) {
        securityEvents.remove(securityEvent)
    }
}