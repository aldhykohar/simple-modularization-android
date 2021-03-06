package com.example.learn_modularization_android

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldhykohar.feature_a.ui.FeatureAActivity
import com.aldhykohar.feature_b.ui.FeatureBActivity
import com.bumptech.glide.Glide
import com.example.learn_modularization_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initClick()
    }

    private fun initClick() {
        binding.moduleAMB.setOnClickListener {
            startActivity(Intent(this, FeatureAActivity::class.java))
        }
        binding.moduleBMB.setOnClickListener {
            startActivity(Intent(this, FeatureBActivity::class.java))
        }
    }
}