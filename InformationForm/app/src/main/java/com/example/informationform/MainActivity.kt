package com.example.personaldetails

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.CompoundButton.OnCheckedChangeListener

import com.example.informationform.databinding.ActivityMainBinding

//import com.example.personaldetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener{
//  val TAG : String =".MainActivity"

    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btnsubmit.setOnClickListener{
            myDetail()

            binding.btnsubmit.setOnClickListener(this)
        }
    }
    fun myDetail(){
        binding.alldetails.text = binding.fname.text.toString() +" "+binding.lname.text.toString()+"\n"+
                binding.mobile.text.toString()+"\n"+
                binding.email.text.toString()
    }


    override fun onClick(view: View?) {
        when (binding.rdGroup.checkedRadioButtonId) {


            binding.btnMale.id -> {
                binding.txtDisplay.text = "" + binding.btnMale.text.toString()
            }
            binding.btnFmale.id -> {
                binding.txtDisplay.text = "" + binding.btnFmale.text.toString()

            }

            binding.btnTrans.id -> {
                binding.txtDisplay.text = "" + binding.btnTrans.text.toString()
            }

        }
    }
}



