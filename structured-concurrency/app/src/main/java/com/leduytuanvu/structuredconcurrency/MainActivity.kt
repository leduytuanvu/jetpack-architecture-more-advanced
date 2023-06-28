package com.leduytuanvu.structuredconcurrency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.leduytuanvu.structuredconcurrency.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bDownload.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                binding.tvDownload.text = UserDataManager().getTotalUserCount().toString()
            }
        }
    }
}