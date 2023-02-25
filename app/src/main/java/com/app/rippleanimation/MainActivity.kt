package com.app.rippleanimation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.app.rippleanimation.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding: ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.image.setOnClickListener {
            binding.rippleAnimation.startRippleAnimation()
        }

        binding.layout.setOnClickListener {
            binding.rippleAnimation.stopRippleAnimation()
        }

    }
}