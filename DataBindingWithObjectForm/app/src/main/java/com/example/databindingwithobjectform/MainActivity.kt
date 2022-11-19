package com.example.databindingwithobjectform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingwithobjectform.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)



        binding.button.setOnClickListener {
            binding.fname.text = binding.firstname.text.toString()
            binding.lname.text = binding.lastname.text.toString()
        }


    }
}