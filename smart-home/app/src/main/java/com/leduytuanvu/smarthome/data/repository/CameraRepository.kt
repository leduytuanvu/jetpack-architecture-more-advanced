package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.CameraFeed

class CameraRepository {
    private val cameraFeeds: MutableList<CameraFeed> = mutableListOf()

    fun getAllCameraFeeds(): List<CameraFeed> {
        return cameraFeeds.toList()
    }

    fun getCameraFeedById(id: String): CameraFeed? {
        return cameraFeeds.find { it.id == id }
    }

    fun addCameraFeed(cameraFeed: CameraFeed) {
        cameraFeeds.add(cameraFeed)
    }

    fun updateCameraFeed(cameraFeed: CameraFeed) {
        val index = cameraFeeds.indexOfFirst { it.id == cameraFeed.id }
        if (index != -1) {
            cameraFeeds[index] = cameraFeed
        }
    }

    fun deleteCameraFeed(cameraFeed: CameraFeed) {
        cameraFeeds.remove(cameraFeed)
    }
}