package com.aldhykohar.feature_a.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aldhykohar.feature_a.R
import com.aldhykohar.feature_a.databinding.ActivityFeatureABinding

class FeatureAActivity : AppCompatActivity() {

    private val binding: ActivityFeatureABinding by lazy {
        ActivityFeatureABinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initClick()
    }

    private fun initClick() {
        binding.moduleBMB.setOnClickListener {
            val intent: Intent
            try {
                intent = Intent(
                    this,
                    Class.forName("com.aldhykohar.feature_b.ui.FeatureBActivity")
                )
                startActivity(intent)
            } catch (e: ClassNotFoundException) {
                e.printStackTrace()
            }
        }
    }
}