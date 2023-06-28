package com.example.viewmodelscope.model

import kotlinx.coroutines.delay

class UserRepository {
    suspend fun getUser(): List<User> {
        delay(3000)
        val users: List<User> = listOf(
            User(1, "John", "jones@gmail.com"),
            User(2, "Duck", "Duck@gmail.com")
        )
        return users
    }
}