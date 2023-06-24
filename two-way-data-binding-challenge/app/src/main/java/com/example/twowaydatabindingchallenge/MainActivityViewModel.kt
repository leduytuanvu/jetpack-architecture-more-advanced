package com.example.twowaydatabindingchallenge

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {
    private val total = MutableLiveData<Int>()
    val totalData : LiveData<Int>
    get() = total

    init {
        total.value = 0
    }

    val inputText = MutableLiveData<String>()

    fun caculate() {
        val intInput: Int = inputText.value?.toInt() ?: 0
        total.value = total.value?.plus(intInput)
    }
}