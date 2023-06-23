package com.example.simpleviewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel  : ViewModel() {
    private var count = 0

    fun getCount() = count

    fun updateCount() {
        count++
    }
}