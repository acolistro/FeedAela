package com.example.feedaela

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.feedaela.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    //view binding
    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //handle click, login
        binding.loginBtn.setOnClickListener {
            //TODO
        }

        //handle click, sip and continue to main screen
        binding.skipBtn.setOnClickListener {
            //TODO
        }


    }
}