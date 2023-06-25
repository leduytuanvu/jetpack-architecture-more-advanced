package com.leduytuanvu.unstructuredconcurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.leduytuanvu.unstructuredconcurrency.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bSecond.setOnClickListener() {
            CoroutineScope(Dispatchers.Main).launch {
                binding.tvSecond.text = UserDataManager().getTotalUserCount().toString()
            }
        }
    }
}