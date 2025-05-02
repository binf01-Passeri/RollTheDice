package com.example.rollthedicepasseri

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random


class MainActivity2 : AppCompatActivity() {

    private val TAG = "MainActivity2"
    private lateinit var txtNumber : TextView
    private lateinit var imgDice : ImageView
    private lateinit var btnResult : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main2)
        Log.d(TAG, "inflate fatto")

        txtNumber = findViewById<TextView>(R.id.idNumber)
        imgDice = findViewById<ImageView>(R.id.idDice)
        btnResult = findViewById<Button>(R.id.idResult)

        val randomNumber = rollDice()

        btnResult.setOnClickListener {
            Toast.makeText(applicationContext,
                "Visualizza il risultato!",
                Toast.LENGTH_LONG).show()

            intent(randomNumber)
            Log.d(TAG, "click del bottone")
        }
    }

    private fun rollDice(): Int{
        Log.d(TAG, "Lancio del dado")
        val randomNumber = (1..6).random()
        Log.d(TAG, "Lancio del dado: " + randomNumber.toString())
        txtNumber.text = randomNumber.toString()
        val imgResources = when (randomNumber) {
            1 -> R.drawable.dice_face_1
            2 -> R.drawable.dice_face_2
            3 -> R.drawable.dice_face_3
            4 -> R.drawable.dice_face_4
            5 -> R.drawable.dice_face_5
            else -> {R.drawable.dice_face_6} }
        imgDice.setImageResource(imgResources)
        return randomNumber
    }

    private fun intent(randomNumber: Int){
        val intent = Intent(this, MainActivity3::class.java)
        startActivity(intent)

    }
}