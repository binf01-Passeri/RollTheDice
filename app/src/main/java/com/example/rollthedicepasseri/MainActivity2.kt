package com.example.rollthedicepasseri

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    private val TAG = "MainActivity2"
    private lateinit var txtNumber : TextView
    private lateinit var imgDice : ImageView
    private lateinit var btnRoll : Button
    private val mioRandom = intent.getIntExtra("NUMERO", -1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main2)
        Log.d(TAG, "inflate fatto")

        txtNumber = findViewById<TextView>(R.id.idNumber)
        imgDice = findViewById<ImageView>(R.id.idDice)
        btnRoll = findViewById<Button>(R.id.idResult)

        btnRoll.setOnClickListener {
            Toast.makeText(applicationContext,
                "Visualizza il risultato!",
                Toast.LENGTH_LONG).show()
        }
    }
}