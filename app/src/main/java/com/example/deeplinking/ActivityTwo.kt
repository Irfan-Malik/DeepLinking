package com.example.deeplinking

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout

class ActivityTwo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var text = findViewById<TextView>(R.id.screenName)
        text.text = "ScreenTwo"
        text.setTextColor(Color.RED)
        findViewById<ConstraintLayout>(R.id.mainLayout).setBackgroundColor(Color.YELLOW)
    }
}