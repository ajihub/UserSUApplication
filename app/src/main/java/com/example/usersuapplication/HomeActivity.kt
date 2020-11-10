package com.example.usersuapplication

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class HomeActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val photos = intArrayOf(R.drawable.rand, R.drawable.rand2, R.drawable.rand3, R.drawable.rand4, R.drawable.rand5)
        val image = findViewById<ImageView>(R.id.imageChBtn) as ImageView
        val ran = Random(rand(1,5))
        val i: Int = ran.nextInt(photos.size)
        image.setImageResource(photos[i])
        image.setOnClickListener() {
                val k: Int = ran.nextInt(photos.size)
                image.setImageResource(photos[k])
        }

        val txt = findViewById<TextView>(R.id.displayvalsID)
        val output = intent.getStringExtra("output")
        txt.text = output
    }//End of ON CREATE

    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Illegal Argument" }
        return Random(System.nanoTime()).nextInt(start, end + 1)
    }




}