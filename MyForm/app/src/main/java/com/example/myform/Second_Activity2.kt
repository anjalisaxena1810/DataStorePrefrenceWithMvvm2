package com.example.myform

import android.app.Activity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.myform.databinding.ActivitySecond2Binding
import java.util.jar.Attributes

class Second_Activity2 : AppCompatActivity() {
    private lateinit var  binding: ActivitySecond2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecond2Binding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val ShowData = intent.extras
        val fname = ShowData!!.getString(keys.fname)
        val lname = ShowData!!.getString(keys.lname)
        val mobile = ShowData!!.getString(keys.mobile)
        val email = ShowData!!.getString(keys.email)
        val gender = ShowData!!.getString(keys.gender)
        val hobbies = ShowData!!.getString(keys.hobbies)





//           this intilization used when we call with intent with binding
//
//         var ShowData = intent
//        var fname:String = ShowData.getStringExtra("fname").toString()
//        var lname:String = ShowData.getStringExtra("lname").toString()
//        var mobile:String = ShowData.getStringExtra("mobile").toString()
//
//
//        var email:String = ShowData.getStringExtra("email").toString()
//        var gender:String = ShowData.getStringExtra("gender").toString()
//        var hobbies:String = ShowData.getStringExtra("hobbies").toString()

        binding.Shareinfo.text = "Name : "  + "$fname $lname" +  "\n" +
                                 "Mobile : " + "$mobile"+"\n"+
                                  "Email : " + "$email"+"\n"+
                                 " Gender : " + "$gender"+"\n"+
                                  "hobbies : " + "$hobbies"

//        run
    }
}