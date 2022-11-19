package com.example.myform

import android.content.Intent
import android.nfc.Tag
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore.Audio.Radio
import android.util.Log
import android.view.View
import android.view.View.inflate
import android.widget.CompoundButton
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.RadioGroup.OnCheckedChangeListener
import android.widget.Toast
import com.example.myform.databinding.ActivityMainBinding
import java.util.Objects

 class MainActivity : AppCompatActivity(), View.OnClickListener ,
    CompoundButton.OnCheckedChangeListener {


    private lateinit var binding : ActivityMainBinding
    private var listOfCheckBoxText =ArrayList<String>()
    protected lateinit var gender:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


//         to call radio button on click
        binding.btnsubmit.setOnClickListener(this)
// for check boxes
        binding.cbcoding.setOnCheckedChangeListener(this)
        binding.teach.setOnCheckedChangeListener(this)
        binding.Accept.setOnCheckedChangeListener(this)
        binding.cbengg.setOnCheckedChangeListener(this)
        binding.travel.setOnCheckedChangeListener(this)

//         send Data Second Activity help of intent

    }
     private fun sharedata(){
         intent = Intent(this@MainActivity, Second_Activity2::class.java)
         val bundle  = Bundle()
         bundle.putString(keys.fname,binding.fname.text.toString())
         bundle.putString(keys.lname,binding.lname.text.toString())
         bundle.putString(keys.mobile,binding.mobile.text.toString())
         bundle.putString(keys.email,binding.email.text.toString())
         bundle.putString(keys.gender,gender)
         bundle.putString(keys.hobbies,listOfCheckBoxText.joinToString())

         intent.putExtras(bundle)
         startActivity(intent)






     }


//         using without bundle
//        binding.btnsubmit.setOnClickListener() {
//            intent = Intent(this@MainActivity, Second_Activity2::class.java)
//            var fname: String = binding.fname.text.toString()
//            var lname: String = binding.lname.text.toString()
//            var mobile: String = binding.mobile.text.toString()
//            var email: String = binding.email.text.toString()
//
//
//            intent.putExtra("fname", fname)
//            intent.putExtra("lname", lname)
//            intent.putExtra("mobile", mobile)
//            intent.putExtra("email", email)
//            intent.putExtra("gender",gender)
//            intent.putExtra("hobby", listOfCheckBoxText.joinToString())
//            startActivity(intent)
//
//        }





    //  Method for radio button functionality
    override fun onClick(view: View?) {
        when (binding.gender.checkedRadioButtonId) {

            binding.btnMale.id -> {
                gender = binding.btnMale.text.toString()
            }
            binding.btnFmale.id -> {
                gender = binding.btnFmale.text.toString()

            }

            binding.btnTrans.id -> {
                gender = binding.btnTrans.text.toString()
            }
        }
        sharedata()
    // myDetail()
//        binding.txtDis.text = listOfCheckBoxText.toString() }
    }
    override fun onCheckedChanged(view: CompoundButton?, p1:Boolean){
        when(view?.id) {
            R.id.cbcoding -> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.cbcoding.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.cbcoding.text.toString())) {
                        listOfCheckBoxText.remove(binding.cbcoding.text.toString())
                    }
                }
            }
            R.id.cbengg-> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.cbengg.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.cbengg.text.toString())) {
                        listOfCheckBoxText.remove(binding.cbengg.text.toString())
                    }
                }
            }
            R.id.travel-> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.travel.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.travel.text.toString())) {
                        listOfCheckBoxText.remove(binding.travel.text.toString())
                    }
                }
            }
            R.id.teach-> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.teach.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.teach.text.toString())) {
                        listOfCheckBoxText.remove(binding.teach.text.toString())
                    }
                }
            }
            R.id.Accept-> {
                if (view.isChecked) {
                    listOfCheckBoxText.add(binding.Accept.text.toString())
                } else {
                    if (listOfCheckBoxText.contains(binding.Accept.text.toString())) {
                        listOfCheckBoxText.remove(binding.Accept.text.toString())
                    }
                }
            }


        }
    }

}

















