package com.leduytuanvu.smarthome.data.repository

import com.leduytuanvu.smarthome.data.model.User

class UserRepository {
    private val users: MutableList<User> = mutableListOf()

    fun getAllUsers(): List<User> {
        return users.toList()
    }

    fun getUserById(id: String): User? {
        return users.find { it.id == id }
    }

    fun addUser(user: User) {
        users.add(user)
    }

    fun updateUser(user: User) {
        val index = users.indexOfFirst { it.id == user.id }
        if (index != -1) {
            users[index] = user
        }
    }

    fun deleteUser(user: User) {
        users.remove(user)
    }
}