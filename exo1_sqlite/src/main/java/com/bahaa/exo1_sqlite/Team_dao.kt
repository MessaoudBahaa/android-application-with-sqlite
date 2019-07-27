package com.bahaa.exo1_sqlite

import androidx.room.*


@Dao
interface Team_dao {
    @Insert
    fun addTeam(team:Team)
    @Update
    fun updateTeam(team:Team)
    @Delete
    fun deleteTeam(team:Team)
    @Query("select * from Team")
    fun getTeam():List<Team>
    @Query("select * from Team where Team.id_team=:idteam")
    fun getTeamById(idteam:Int):Team
    @Query("select * from Team where Team.team_name=:teamname")
    fun getTeamByName(teamname:String):List<Team>
}