package com.example.tutorial_xml

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tutorial_xml.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Use ViewBinding to access XML views
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // That's it! Simple setup to match your XML layout
    }
}
