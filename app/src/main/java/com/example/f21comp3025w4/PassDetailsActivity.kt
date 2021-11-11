package com.example.f21comp3025w4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f21comp3025w4.databinding.ActivityPassDetailsBinding

class PassDetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityPassDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPassDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backToMainButton.setOnClickListener {
            finish()
        }

        binding.passDetailsNameTextView.text = "Welcome " + intent.getStringExtra("passDetailsNameTextView")

    }
}