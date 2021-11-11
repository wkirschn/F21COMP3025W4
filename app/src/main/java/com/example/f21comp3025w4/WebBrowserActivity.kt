package com.example.f21comp3025w4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.f21comp3025w4.databinding.ActivityWebBrowserBinding

class WebBrowserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityWebBrowserBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}