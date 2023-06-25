package com.leduytuanvu.asyncawait

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.leduytuanvu.asyncawait.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        CoroutineScope(Dispatchers.Main).launch {
            Log.i("Stock", "Starting...")
            val stock1 = async(Dispatchers.IO) { getStock1() }
            val stock2 = async(Dispatchers.IO) { getStock2() }
            val total = stock1.await() + stock2.await()
            Toast.makeText(applicationContext, "Total: $total", Toast.LENGTH_SHORT).show()
        }

//        CoroutineScope(Dispatchers.IO).launch {
//            Log.i("Stock", "Starting...")
////            val stock1 = getStock1()
////            val stock2 = getStock2()
//            val stock1 = async { getStock1() }
//            val stock2 = async { getStock2() }
//            val total = stock1.await() + stock2.await()
//            Log.i("Stock", "Total: $total")
//        }
    }
}

private suspend fun getStock1(): Int {
    delay(10000)
    Log.i("Stock", "Stock 1")
    return 55000
}

private suspend fun getStock2(): Int {
    delay(8000)
    Log.i("Stock", "Stock 2")
    return 35000
}