package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val buttonBackToFirstActivity = findViewById<Button>(R.id.buttonBackToFirst);
        buttonBackToFirstActivity.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent);
            finish();
        }
        val buttonNextToThirdActivity = findViewById<Button>(R.id.buttonNextToThird);
        buttonNextToThirdActivity.setOnClickListener{
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent);
            finish();
        }
    }
}