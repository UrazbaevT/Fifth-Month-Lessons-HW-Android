package com.example.a4month_lesson3

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class PixaService {
    var retrofit = Retrofit.Builder().baseUrl("https://pixabay.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    var api = retrofit.create(PixaApi::class.java)
}