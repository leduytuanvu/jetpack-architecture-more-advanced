package com.leduytuanvu.ourfirstcoroutine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import com.leduytuanvu.ourfirstcoroutine.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding
    private var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.bCount.setOnClickListener {
            binding.tvCount.text = count++.toString()
        }

        binding.bDownload.setOnClickListener {
            CoroutineScope(Dispatchers.IO).launch {
                downloadData()
            }
        }
    }

    // Use suspend to call this function in coroutine
    private suspend fun downloadData() {
        for (i in 1..200000) {
            withContext(Dispatchers.Main) {
                binding.tvDownload.text = "Downloading $i in ${Thread.currentThread().name}"
                delay(1000)
            }
        }
    }
}