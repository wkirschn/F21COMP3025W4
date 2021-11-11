package com.example.f21comp3025w4

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.f21comp3025w4.databinding.ActivityWebBrowserBinding

class WebBrowserActivity : AppCompatActivity() {

    private lateinit var binding : ActivityWebBrowserBinding




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebBrowserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //configure the back to main button
        binding.backToMainButton.setOnClickListener {
            finish()
        }


        // Create an IMPLICIT intent to web services

        binding.loadURLButton.setOnClickListener {
            if(binding.textViewUri.text.toString().isNullOrBlank())
            {
                Toast.makeText(this, "Add a URL", Toast.LENGTH_LONG).show()
            }

            else {
                var url = binding.textViewUri.text.toString()

                // check for HTTPS://
                if (!(url.startsWith("http://") || url.startsWith("https://"))) {
                    url = "http://" + url



                    // create an implicit intent
                    val intent = Intent(Intent.ACTION_VIEW)

                    //add data to the intent

                    intent.data = Uri.parse(url)

                    //launch the intent

                    startActivity(intent)

                } else {
                    Toast.makeText(this, "Error in loading URL!", Toast.LENGTH_LONG).show()
                }

            }

        }


    }
}