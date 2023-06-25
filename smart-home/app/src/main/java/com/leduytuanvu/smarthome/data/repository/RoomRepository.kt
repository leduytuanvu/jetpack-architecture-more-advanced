package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.Room

class RoomRepository {
    private val rooms: MutableList<Room> = mutableListOf()

    fun getAllRooms(): List<Room> {
        return rooms.toList()
    }

    fun getRoomById(id: String): Room? {
        return rooms.find { it.id == id }
    }

    fun addRoom(room: Room) {
        rooms.add(room)
    }

    fun updateRoom(room: Room) {
        val index = rooms.indexOfFirst { it.id == room.id }
        if (index != -1) {
            rooms[index] = room
        }
    }

    fun deleteRoom(room: Room) {
        rooms.remove(room)
    }
}