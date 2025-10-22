package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val textView = findViewById<TextView>(R.id.thirdTextView)
        val editText = findViewById<EditText>(R.id.thirdEditText)
        val btnSubmit = findViewById<Button>(R.id.thirdBtnSubmit)
        val btnBack = findViewById<Button>(R.id.thirdBtnBack)

        val name = intent.getStringExtra("NAME")
        textView.text = "Hello $name to third activity"

        btnSubmit.setOnClickListener {
            textView.text = editText.text.toString()
        }

        btnBack.setOnClickListener {
            finish()
        }
    }
}
