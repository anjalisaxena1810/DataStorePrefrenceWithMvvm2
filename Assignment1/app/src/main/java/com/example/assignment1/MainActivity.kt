package com.example.assignment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlin.math.absoluteValue

class MainActivity : AppCompatActivity() {

}
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         val height= findViewById<EditText>(R.id.et_height)
        val weight=  findViewById<EditText>(R.id.et_weight)
        val ResultButton = findViewById<Button>(R.id.btn_Result)
//        val ResetButton = findViewById<Button>(R.id.btn_Reset)
        val bmi = findViewById<textview>(R.id.tv_collect)

        btn_Result.setonClicklistener(){
            var et_height = null
            val et_height = et_height.text.toString()
            val et_weight = et_weight.text.toString()


        }




