package com.example.a4monthlesson8hw8

import android.app.Application
import androidx.room.Room
import com.example.a4monthlesson8hw8.room.AppDatabase
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {

    companion object {
        lateinit var appDatabase: AppDatabase
    }

    override fun onCreate() {
        super.onCreate()
        appDatabase =
            Room.databaseBuilder(applicationContext, AppDatabase::class.java, "love_table")
                .allowMainThreadQueries().build()
    }
}