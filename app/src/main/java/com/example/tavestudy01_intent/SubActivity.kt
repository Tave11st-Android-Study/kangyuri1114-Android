package com.example.tavestudy01_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        val btnClose: Button = findViewById(R.id.btnClose)
        btnClose.setOnClickListener {
            finish()
        }
    }
}