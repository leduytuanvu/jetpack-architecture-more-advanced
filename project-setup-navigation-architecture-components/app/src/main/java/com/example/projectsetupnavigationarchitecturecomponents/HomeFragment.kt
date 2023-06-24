package com.example.projectsetupnavigationarchitecturecomponents

import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.projectsetupnavigationarchitecturecomponents.databinding.ActivityMainBinding
import com.example.projectsetupnavigationarchitecturecomponents.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    // Add this line to use data binding
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Add this line to use data binding
        binding = DataBindingUtil.inflate<FragmentHomeBinding>(inflater, R.layout.fragment_home, container, false)

        binding.bButtonHome.setOnClickListener{
            if(!TextUtils.isEmpty(binding.etEditTextHome.text.toString())){
                val bundle: Bundle = bundleOf("user_input" to binding.etEditTextHome.text.toString())
                // Add this line to navigate to SecondFragment
                it.findNavController().navigate(R.id.action_homeFragment_to_secondFragment, bundle)
            } else {
                // Add this line to show toast message
                Toast.makeText(activity, "Please enter your name", Toast.LENGTH_SHORT).show()
            }
        }

        return binding.root
    }
}