package com.example.databindingwithobjects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingwithobjects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Add this line to use data binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Add this line to use data binding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // Add this line to use data binding
        binding.student = getStudent()
    }

    private fun getStudent(): Student {
        return Student("1", "TuanVu", "20")
    }
}