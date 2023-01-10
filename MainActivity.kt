package com.example.wuerfelapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val image = findViewById<ImageView>(R.id.dice_1)
        val button = findViewById<Button>(R.id.roll)
        val luckytext = findViewById<TextView>(R.id.luckytext)
        button.setOnClickListener {

            val random = (1..6).random()

            when (random) {
                1 -> {
                    image.setImageResource(R.drawable.dice_1)
                    luckytext.text = ""
                }
                2 -> {
                    image.setImageResource(R.drawable.dice_2)
                    luckytext.text = ""
                }
                3 -> {
                    image.setImageResource(R.drawable.dice_3)
                    luckytext.text = ""
                }
                4 -> {
                    image.setImageResource(R.drawable.dice_4)
                    luckytext.text = ""
                }
                5 -> {
                    image.setImageResource(R.drawable.dice_5)
                    luckytext.text = ""
                }
                6 -> {
                    image.setImageResource(R.drawable.dice_6)
                    luckytext.text = "You have luck today"


                }


            }

        }
    }
}