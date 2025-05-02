package com.example.rollthedicepasseri

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {

    private val TAG = "MainActivity3"
    private lateinit var txtTitle : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(R.layout.activity_main3)
        Log.d(TAG, "inflate fatto")

        txtTitle = findViewById<TextView>(R.id.idTitle)
        val randomNumber = intent.getIntExtra("NUMERO", -1)

        //Si vince se il numero è maggiore o uguale a 4
        if(randomNumber >= 4){
            txtTitle.text = "Hai Vinto!"
        }
        else{
            txtTitle.text = "Hai perso"
        }
    }
}