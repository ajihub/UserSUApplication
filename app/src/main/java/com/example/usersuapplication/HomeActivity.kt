package com.example.usersuapplication

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    //RANDOMIZE IMAGE VIEW FROM IMAGES IN RES, AND MADE AN ON-CLICK FEATURE TO CHANGE THE CURRENT IMAGE
        val photos = intArrayOf(R.drawable.rand, R.drawable.rand2, R.drawable.rand3, R.drawable.rand4, R.drawable.rand5)
        val image = findViewById<ImageView>(R.id.imageChBtn) as ImageView
        val ron = Random(rand(1,5))
        val ran = (0..4).random()
        val i: Int = ron.nextInt(photos.size)
        image.setImageResource(photos[ran])
        image.setOnClickListener() {
                val k: Int = ron.nextInt(photos.size)
                image.setImageResource(photos[k])
        }
    //DISPLAY RESULTS
        val txt = findViewById<TextView>(R.id.displayvalsID)
        val output = intent.getStringExtra("output")
        txt.text = output
    }//END OF MAIN/ON CREATE

    //RANDOMIZING FUNCTION
        private fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
            return (start..end).random()

    }
}