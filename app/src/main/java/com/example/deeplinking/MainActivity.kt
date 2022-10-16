package com.example.deeplinking

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var uri = intent.extras
        var text = findViewById<TextView>(R.id.screenName)
        text.text = "MainScreen"
        if(intent.data.toString().contains("one")) {
            startActivity(Intent(this, ActivityOne::class.java))
            finishAffinity()
        }
        else if(intent.data.toString().contains("two")) {
            startActivity(Intent(this, ActivityTwo::class.java))
            finishAffinity()
        }

    }
}