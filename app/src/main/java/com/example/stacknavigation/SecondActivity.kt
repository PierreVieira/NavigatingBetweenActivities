package com.example.stacknavigation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.stacknavigation.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySecondBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.goToThirdButton.setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}