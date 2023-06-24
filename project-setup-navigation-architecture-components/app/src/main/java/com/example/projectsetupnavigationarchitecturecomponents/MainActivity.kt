package com.example.projectsetupnavigationarchitecturecomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.projectsetupnavigationarchitecturecomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Add this line to use data binding
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Add this line to use data binding
        binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
    }
}