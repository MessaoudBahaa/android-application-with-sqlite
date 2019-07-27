package com.bahaa.exo1_sqlite

import androidx.room.*

@Dao
interface Player_dao {

    @Insert
    fun addPlayer(player:Player)
    @Update
    fun updatePlayer(player:Player)
    @Delete
    fun deletePlayer(player:Player)
    @Query("select * from Player")
    fun getPlayer():List<Player>
    @Query("select * from Player ,Team  where Team.team_name=:teamname and Player.id_team=Team.id_team")
    fun getPlayersTeam(teamname:String):List<Player>
}