package com.example.simpleviewmodelchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.simpleviewmodelchallenge.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        binding.tvText.text = viewModel.getCount().toString()

        binding.bButton.setOnClickListener(){
            viewModel.updateCount(binding.etText.text.toString().toInt())
            binding.tvText.text = viewModel.getCount().toString()
        }
    }
}