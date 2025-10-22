package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnBack = findViewById<Button>(R.id.btnBack)

        val name = intent.getStringExtra("NAME")
        textView.text = "Hello $name to second activity"

        btnSubmit.setOnClickListener {
            textView.text = editText.text.toString()
        }

        btnNext.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
