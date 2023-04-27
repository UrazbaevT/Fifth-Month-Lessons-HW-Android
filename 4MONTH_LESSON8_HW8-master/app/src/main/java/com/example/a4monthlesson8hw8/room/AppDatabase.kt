package com.example.a4monthlesson8hw8.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.a4monthlesson8hw8.remote.LoveModel

@Database(entities = [LoveModel::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract fun loveDao(): LoveDao
}