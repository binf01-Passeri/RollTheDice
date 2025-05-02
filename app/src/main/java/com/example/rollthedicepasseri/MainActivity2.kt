package com.example.rollthedicepasseri

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    private val TAG = "MainActivity2"
    private lateinit var txtNumber : TextView
    private lateinit var imgDice : ImageView
    private lateinit var btnRoll : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main2)
        Log.d(TAG, "inflate fatto")

        txtNumber = findViewById<TextView>(R.id.idNumber)
        imgDice = findViewById<ImageView>(R.id.idDice)
        btnRoll = findViewById<Button>(R.id.idRoll)


    }
}