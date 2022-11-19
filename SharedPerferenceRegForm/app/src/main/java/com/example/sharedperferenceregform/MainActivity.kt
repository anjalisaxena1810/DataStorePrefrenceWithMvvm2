package com.example.sharedperferenceregform

import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.sharedperferenceregform.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var sharedPreferences: SharedPreferences
    lateinit var editor: SharedPreferences.Editor
    lateinit var databinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        databinding.login.setOnClickListener(this)

    }

    override fun onClick(view: View?) {

        sharedPreferences = getSharedPreferences("Login", MODE_PRIVATE)
         editor = sharedPreferences.edit()

        editor.putString(Keys.e1,databinding.uname.text.toString())

        editor.putString(Keys.e2,databinding.pswrd.text.toString())

        editor.putBoolean("log_in", true)

        editor.commit()

        val intent = Intent(this@MainActivity,welcomeActivity2::class.java)
        startActivity(intent)

        Toast.makeText(this,"login Successful",Toast.LENGTH_SHORT).show()
    }
}


      



