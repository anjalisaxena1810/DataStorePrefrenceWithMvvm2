package com.example.jaimatadi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.jaimatadi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var dataBinding: ActivityMainBinding
    private lateinit var NAME: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        dataBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)




        dataBinding.Submit.setOnClickListener {


            dataBinding.Submit.setOnClickListener {
                if (dataBinding.first.text.toString().isEmpty()) {
                    Toast.makeText(this, "Enter your first Name", Toast.LENGTH_SHORT)
                        .show()

//            } else if (dataBinding.Middle.text.toString().) {
//                Toast.makeText(this, "Enter your Middle Name", Toast.LENGTH_SHORT).show()
                } else if (dataBinding.Last.text.toString().isEmpty()) {
                    Toast.makeText(this, "Enter your Last Name", Toast.LENGTH_SHORT).show()
                } else if (dataBinding.Mobile.toString().isEmpty()){
                 Toast.makeText(this, "Enter your Mobile Number", android.widget.Toast.LENGTH_SHORT).show()
                } else if (dataBinding.Mobile.toString().matches("^[6-9]\\d{9}\$".toRegex())) {
                Toast.makeText(this, "Your Mobile Number Must be Start 6,7,8,9 Digits", Toast.LENGTH_SHORT).show()

//            } else if (dataBinding.Mobile.toString().length != 11) {
//                Toast.makeText(this, "Your Mobile Number Must be 10 Digits", Toast.LENGTH_SHORT)
//                    .show()
            } else {

            NAME = dataBinding.first.text.toString() + dataBinding.Middle.text.toString() +
                    dataBinding.Last.text.toString()


            dataBinding.Display.text = "Name :" +  NAME +"\n" +
                    "Mobile No : " + dataBinding.Mobile.text.toString() + "\n" +
                    "EmailID :" + dataBinding.Email.text.toString()
        }

        }
        }
    }
}
