package com.bahaa.exo1_sqlite

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = arrayOf(Player::class,Team::class),version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun getPlayerDao():Player_dao
    abstract fun getTeamDao():Team_dao
}