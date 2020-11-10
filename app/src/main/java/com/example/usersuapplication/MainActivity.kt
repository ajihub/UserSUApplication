package com.example.usersuapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    lateinit var slider :SeekBar
    lateinit var value :TextView
    lateinit var switch: Switch
    lateinit var phonenumbertext: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//VISIBILITY CHECK
        phonenumbertext = findViewById(R.id.PhoneNumberBtn)
        phonenumbertext.setVisibility(View.INVISIBLE)
        switch = findViewById<Switch>(R.id.switch1) as Switch
        switch.setOnClickListener{
            if(findViewById<Switch>(R.id.switch1).isChecked){
                phonenumbertext.setVisibility(View.VISIBLE)
            }else{
                phonenumbertext.setVisibility(View.INVISIBLE)
            }
        }

//SEEKBAR
        slider = findViewById(R.id.volumeSeekBar) as SeekBar
        value = findViewById(R.id.Agenum) as TextView
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                value.text = progress.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar?) {
            }
            override fun onStopTrackingTouch(seekBar: SeekBar?) {
            }
        })



        //

    }



}


