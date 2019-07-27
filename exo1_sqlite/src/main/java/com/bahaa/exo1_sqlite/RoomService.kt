package com.bahaa.exo1_sqlite

import android.content.Context
import androidx.room.Room

object RoomService {

    lateinit var context: Context
    val appDatabase:AppDatabase by lazy {
        Room.databaseBuilder(context,AppDatabase::class.java,
            "name")
            .allowMainThreadQueries().build()
    }}