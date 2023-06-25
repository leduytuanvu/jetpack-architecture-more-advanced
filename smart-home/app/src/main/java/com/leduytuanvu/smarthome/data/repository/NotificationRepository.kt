package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.Notification

class NotificationRepository {
    private val notifications: MutableList<Notification> = mutableListOf()

    fun getAllNotifications(): List<Notification> {
        return notifications.toList()
    }

    fun getNotificationById(id: String): Notification? {
        return notifications.find { it.id == id }
    }

    fun addNotification(notification: Notification) {
        notifications.add(notification)
    }

    fun updateNotification(notification: Notification) {
        val index = notifications.indexOfFirst { it.id == notification.id }
        if (index != -1) {
            notifications[index] = notification
        }
    }

    fun deleteNotification(notification: Notification) {
        notifications.remove(notification)
    }
}