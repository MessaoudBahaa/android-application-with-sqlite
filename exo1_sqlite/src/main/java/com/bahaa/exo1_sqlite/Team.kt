package com.bahaa.exo1_sqlite

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity
data class Team(
    var team_name :String,
    var continent:String
){
    @PrimaryKey
    var id_team :Int?=null
}