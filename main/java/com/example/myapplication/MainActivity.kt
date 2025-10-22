package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val editText = findViewById<EditText>(R.id.editText)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnNext = findViewById<Button>(R.id.btnNext)

        textView.text = "Welcome to MainActivity"

        btnSubmit.setOnClickListener {
            val name = editText.text.toString()
            textView.text = "Hello $name"
        }

        btnNext.setOnClickListener {
            val name = editText.text.toString()
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("NAME", name)
            startActivity(intent)
        }
    }
}
