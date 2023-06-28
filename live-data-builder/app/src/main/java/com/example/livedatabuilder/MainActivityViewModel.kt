package com.example.livedatabuilder

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.viewModelScope
import com.example.livedatabuilder.model.User
import com.example.livedatabuilder.model.UserRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivityViewModel : ViewModel() {
    private var userRepository = UserRepository()
    var users = liveData (Dispatchers.IO) {
        val result = userRepository.getUsers()
        emit(result)
    }
//    var users: MutableLiveData<List<User>> = MutableLiveData()
//
//    fun getUsers() {
//        viewModelScope.launch {
//            var result: List<User> = listOf()
//            withContext(Dispatchers.IO) {
//                result = userRepository.getUsers()
//            }
//            users.value = result
//        }
//    }
}