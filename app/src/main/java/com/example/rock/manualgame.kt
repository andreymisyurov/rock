package com.example.rock

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class manualgame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_manualgame)

        val backbutton: Button = findViewById(R.id.backbutton)

        val intentback = Intent(this, MainActivity::class.java)

        backbutton.setOnClickListener{
            startActivity(intentback)


        }
    }
}