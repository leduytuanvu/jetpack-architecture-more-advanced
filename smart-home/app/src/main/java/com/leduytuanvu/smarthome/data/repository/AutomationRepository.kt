package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.Automation

class AutomationRepository {
    private val automations: MutableList<Automation> = mutableListOf()

    fun getAllAutomations(): List<Automation> {
        return automations.toList()
    }

    fun getAutomationById(id: String): Automation? {
        return automations.find { it.id == id }
    }

    fun addAutomation(automation: Automation) {
        automations.add(automation)
    }

    fun updateAutomation(automation: Automation) {
        val index = automations.indexOfFirst { it.id == automation.id }
        if (index != -1) {
            automations[index] = automation
        }
    }

    fun deleteAutomation(automation: Automation) {
        automations.remove(automation)
    }
}
