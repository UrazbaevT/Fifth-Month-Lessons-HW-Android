package com.example.a4monthlesson8hw8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a4month_lesson6hw6.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}