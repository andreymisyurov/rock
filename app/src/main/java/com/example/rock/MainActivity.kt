package com.example.rock

import android.annotation.SuppressLint
import android.app.UiModeManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.nextInt
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_NEW_TASK
import android.view.Menu
import android.widget.CompoundButton
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.content.getSystemService
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.switchmaterial.SwitchMaterial


private const val VALUES = "Values"

class MainActivity : AppCompatActivity() {

    private lateinit var playtext: TextView
    private lateinit var playbutton: Button
    private lateinit var manualbutton: Button
    private lateinit var youtubebutton: Button
    private lateinit var rock: TextView
    private lateinit var scissor: TextView
    private lateinit var paper: TextView
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    private lateinit var switcherMode: SwitchMaterial
    private lateinit var nextbutton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        playbutton = findViewById(R.id.playbutton_centr)
        playtext = findViewById(R.id.text_centr)
        playtext.textSize = (55F)
        //   scissor.text = "2"

        switcherMode = findViewById(R.id.switcherMode)
        switcherMode.setOnCheckedChangeListener { _ , isChecked ->
            if (isChecked) {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }
            else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        playbutton.setOnClickListener {
            randomize()
        }

        if (savedInstanceState != null) {
            playtext.text = savedInstanceState.getString(VALUES)
        }

        manualbutton = findViewById(R.id.button_topleft)
        val manualintent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("https://ru.wikipedia.org/wiki/%D0%9A%D0%B0%D0%BC%D0%B5%D0%BD%D1%8C,_%D0%BD%D0%BE%D0%B6%D0%BD%D0%B8%D1%86%D1%8B,_%D0%B1%D1%83%D0%BC%D0%B0%D0%B3%D0%B0")
        )
        manualbutton.setOnClickListener {
            startActivity(manualintent)
        }

        youtubebutton = findViewById(R.id.button_topright)
        val youtubeintent = Intent(
            Intent.ACTION_VIEW,
            Uri.parse("http://www.youtube.com/watch?v=" + "-6fS2ndNs1U"))
        youtubebutton.setOnClickListener {
            startActivity(youtubeintent)
        }

        nextbutton = findViewById(R.id.nextslide)
        val intentbutton = Intent(this, manualgame::class.java)
        nextbutton.setOnClickListener {
            startActivity(intentbutton)
        }

    }


    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(VALUES, playtext.text.toString())
    }

    fun randomize() {
        val randomValue = Random.nextInt(1..3)
        playtext.text = when (randomValue) {
            1 -> "камень"
            2 -> "ножницы"
            3 -> "бумага"

            else -> "_"
        }
    }
}


//android:excludeFromRecents="true" настройки для унчтожения таска при выходе