package com.example.checkboxdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.CompoundButton.OnCheckedChangeListener
import com.example.checkboxdemo.databinding.ActivityMainBinding
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), OnCheckedChangeListener {

    private lateinit var binding: ActivityMainBinding
    private var listOfCheckBoxText =ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnsubmit.setOnClickListener {

            binding.cbmale.setOnCheckedChangeListener(this)
            binding.cbfemale.setOnCheckedChangeListener(this)


            binding.tvDisplay.text = listOfCheckBoxText.toString()


        }


    }
     override fun onCheckedChanged(view:CompoundButton?, p1:Boolean){
                        when(view?.id) {
                            R.id.cbmale -> {
                                if (view.isChecked) {
                                    listOfCheckBoxText.add(binding.cbmale.text.toString())
                                } else {
                                    if (listOfCheckBoxText.contains(binding.cbmale.text.toString())) {
                                        listOfCheckBoxText.remove(binding.cbmale.text.toString())
                                    }
                                }

                            }
                            R.id.cbfemale -> {
                                if (view.isChecked) {
                                    listOfCheckBoxText.add(binding.cbfemale.text.toString())
                                } else {
                                    if (listOfCheckBoxText.contains(binding.cbfemale.text.toString())) {
                                        listOfCheckBoxText.remove(binding.cbfemale.text.toString())
                                    }
                                }
                            }
                        }
     }
}

