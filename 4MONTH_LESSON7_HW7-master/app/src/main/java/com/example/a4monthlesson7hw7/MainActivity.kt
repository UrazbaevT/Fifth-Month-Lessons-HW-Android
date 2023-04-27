package com.example.a4monthlesson7hw7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4monthlesson7hw7.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        with(binding) {
            btnCalculator.setOnClickListener {
                resultTv.text = Math()
                    .add(firstEd.text.toString(), secondEd.text.toString())
            }
        }
    }
}