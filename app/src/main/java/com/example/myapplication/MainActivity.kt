package com.example.myapplication

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    // I varianti
    lateinit var continueButton : TextView

    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // I varianti
        continueButton = findViewById(R.id.continueButton)

        continueButton.setOnClickListener {
            Toast.makeText(this, "congrats!", Toast.LENGTH_SHORT).show()
        }

        // II varianti
        var playButton = findViewById<TextView>(R.id.playButton)
        var number = findViewById<TextView>(R.id.numberTextView)
        playButton.setOnClickListener {
            var num = number.text.toString().toInt()
            num++
            number.text = num.toString()
        }

        // III varianti
//        findViewById<TextView>(R.id.numberTextView).setOnClickListener {
//
//        }


        var num1 = findViewById<TextView>(R.id.num1)
        var num2 = findViewById<TextView>(R.id.num2)
        var sum = findViewById<TextView>(R.id.sum)
        var button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            var number1 = num1.text.toString().toInt()
            var number2 = num2.text.toString().toInt()
            sum.text = (number1 + number2).toString()
        }

        var button1 = findViewById<Button>(R.id.colorChange)
        findViewById<Button>(R.id.colorChange).setOnClickListener {
            button1.setBackgroundColor(ContextCompat.getColor(this, R.color.black))
            number.setTextColor(getColor(R.color.purple_500))
        }

        findViewById<ImageView>(R.id.imageView).setOnClickListener {

        }


    }
}