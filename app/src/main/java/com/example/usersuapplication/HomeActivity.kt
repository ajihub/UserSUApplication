package com.example.usersuapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class HomeActivity : AppCompatActivity() {

    val ageResult = findViewById<TextView>(R.id.Agenum).text.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)




    }
}