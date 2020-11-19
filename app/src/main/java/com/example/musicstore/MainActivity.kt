package com.example.musicstore

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Thread.sleep(1000)
        setTheme(R.style.MusicStore)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        startActivity(Intent(this, Entrada::class.java))
        finish();

    }
}