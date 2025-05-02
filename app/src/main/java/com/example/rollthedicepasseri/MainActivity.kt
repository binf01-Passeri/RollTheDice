package com.example.rollthedicepasseri

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"
    private lateinit var txtTitle : TextView
    private lateinit var imgDice : ImageView
    private lateinit var btnRoll : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main)
        Log.d(TAG, "inflate fatto")

        txtTitle = findViewById<TextView>(R.id.idTitle)
        imgDice = findViewById<ImageView>(R.id.idDice)
        btnRoll = findViewById<Button>(R.id.idRoll)

        btnRoll.setOnClickListener {
            Toast.makeText(applicationContext,
                "Gioca con noi!",
                Toast.LENGTH_LONG).show()

            val mioRandom = rollDice()
            intent(mioRandom)
            Log.d(TAG, "click del bottone")
        }
    }

    private fun rollDice(): Int{
        return (1..6).random()
    }

    private fun intent(mioRandom: Int){
        val intent = Intent(this, MainActivity2::class.java)
        intent.putExtra("NUMERO", mioRandom)
        startActivity(intent)

    }
}