package com.example.livedatabuilder.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUsers(): List<User> {
        delay(8000)
        val users: List<User> = listOf(
            User(1, "John"),
            User(2, "Peter"),
            User(3, "Duck")
        )
        return users
    }
}