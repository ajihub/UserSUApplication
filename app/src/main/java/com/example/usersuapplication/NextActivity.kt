package com.example.usersuapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CalendarView
import android.widget.EditText
import android.widget.TextView

class NextActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        //GOTO HOME PAGE BUTTON
        findViewById<Button>(R.id.CompBtn).setOnClickListener{GotoHomeActivity()}

        //Calendar Time
        val calendar = findViewById<CalendarView>(R.id.calendarView)
        val calendarvalue = findViewById<TextView>(R.id.calendarval)
        calendar.setDate(973859619000,false,true)
        calendar.setOnDateChangeListener{calendarView, i, i2, i3 ->
            val month = "$i2"
            calendarvalue.text = ("$i3/$month/$i").toString()
        }



    }

    private fun GotoHomeActivity(){
        val gotohomepage = Intent(this, HomeActivity::class.java)
        val bday = findViewById<TextView>(R.id.calendarval).text.toString()
        val onename =  intent.getStringExtra("fname")
        val secname = intent.getStringExtra("lname")
        val emale = intent.getStringExtra("email")
        val eij = intent.getStringExtra("age")
        val fone = intent.getStringExtra("phone")
        val displayvals = "First Name: \t $onename " +
                "\nLast Name: \t $secname " +
                "\nEmail: \t $emale " +
                "\nAge: \t $eij " +
                "\nBirthday \t $bday" +
                "\nPhone Number: \t $fone"
        gotohomepage.putExtra("output", displayvals)
        startActivity(gotohomepage)
    }
}