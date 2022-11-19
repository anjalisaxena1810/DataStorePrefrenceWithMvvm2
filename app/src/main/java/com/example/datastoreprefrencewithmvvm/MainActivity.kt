package com.example.datastoreprefrencewithmvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.datastoreprefrencewithmvvm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityMainBinding
    private lateinit var factory : DataStoreFactory
    private lateinit var viewModel: DataStoreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        factory = DataStoreFactory(DataStoreSharedPrefRepository(this))
        viewModel = ViewModelProvider(this,factory)[DataStoreViewModel::class.java]
        binding.btn.setOnClickListener {
            viewModel.saveToPref(binding.fname.text.toString(),binding.lname.text.toString())


        }
         binding.btnget.setOnClickListener {
             binding.tv.text ="Hello"+" "+viewModel.getFirstName()+" "+viewModel.getLastName()
         }

    }
}