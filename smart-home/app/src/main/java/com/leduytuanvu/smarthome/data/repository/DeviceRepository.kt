package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.Device

class DeviceRepository {
    private val devices: MutableList<Device> = mutableListOf()

    fun getAllDevices(): List<Device> {
        return devices.toList()
    }

    fun getDeviceById(id: String): Device? {
        return devices.find { it.id == id }
    }

    fun addDevice(device: Device) {
        devices.add(device)
    }

    fun updateDevice(device: Device) {
        val index = devices.indexOfFirst { it.id == device.id }
        if (index != -1) {
            devices[index] = device
        }
    }

    fun deleteDevice(device: Device) {
        devices.remove(device)
    }
}