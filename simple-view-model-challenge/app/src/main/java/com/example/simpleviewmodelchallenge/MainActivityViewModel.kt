package com.example.simpleviewmodelchallenge

import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private var count = 0

    fun getCount() = count

    fun updateCount(addCount: Int) {
        count+=addCount
    }
}