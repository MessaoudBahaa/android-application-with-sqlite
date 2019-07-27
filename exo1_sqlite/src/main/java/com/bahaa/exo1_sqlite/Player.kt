package com.bahaa.exo1_sqlite

import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey


@Entity(foreignKeys = arrayOf( ForeignKey(entity = Team::class,
                                parentColumns = arrayOf("id_team"),
                                    childColumns = arrayOf("id_team"),
                                        onDelete = ForeignKey.CASCADE)))
data class Player ( @PrimaryKey  var id_player:Int, var first_name:String, var last_name:String, var age:Int, var height:Double, var id_team: Int)