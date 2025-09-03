package com.example.tutorial_xml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tutorial_xml.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    //old exampleprivate lateinit var binding: ActivityMainBinding
    //old example now it is changed to new logic for fomr handling XML views
    /*override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use ViewBinding to access XML views
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // That's it! Simple setup to match your XML layout
    }*/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val buttonSubmit = findViewById<Button>(R.id.buttonSubmit)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        buttonSubmit.setOnClickListener {
            val name = editTextName.text.toString().trim()
            if (name.isNotEmpty()) {
                textViewResult.text = "Hello, $name!"
            } else {
                textViewResult.text = "Please enter your name!"
            }
        }
    }
}
