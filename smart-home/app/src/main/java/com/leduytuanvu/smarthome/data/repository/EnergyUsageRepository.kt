package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.EnergyUsage

class EnergyUsageRepository {
    private val energyUsages: MutableList<EnergyUsage> = mutableListOf()

    fun getAllEnergyUsages(): List<EnergyUsage> {
        return energyUsages.toList()
    }

    fun getEnergyUsageById(id: String): EnergyUsage? {
        return energyUsages.find { it.id == id }
    }

    fun addEnergyUsage(energyUsage: EnergyUsage) {
        energyUsages.add(energyUsage)
    }

    fun updateEnergyUsage(energyUsage: EnergyUsage) {
        val index = energyUsages.indexOfFirst { it.id == energyUsage.id }
        if (index != -1) {
            energyUsages[index] = energyUsage
        }
    }

    fun deleteEnergyUsage(energyUsage: EnergyUsage) {
        energyUsages.remove(energyUsage)
    }
}