package com.example.projectsetupnavigationarchitecturecomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.projectsetupnavigationarchitecturecomponents.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    // Add this line to use data binding
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Add this line to use data binding
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second, container, false)

        var input = requireArguments().getString("user_input")
        binding.tvSecond.text = input

        return binding.root
    }
}