package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonNextToSecondActivity = findViewById<Button>(R.id.buttonNextToSecond);
        buttonNextToSecondActivity.setOnClickListener{
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent);
            finish();
        }
    }
}