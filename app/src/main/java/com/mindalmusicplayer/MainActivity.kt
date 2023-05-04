package com.mindalmusicplayer

import android.graphics.drawable.AnimatedVectorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.mindalmusicplayer.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btn1.setOnClickListener {

        val animationFadeIn = AnimationUtils.loadAnimation(this, R.anim.rotate)
         binding.imageView.startAnimation(animationFadeIn)
         binding.imageView.setImageResource(R.drawable.animator)
        (binding.imageView.drawable as AnimatedVectorDrawable).start()

        }
    }
}
