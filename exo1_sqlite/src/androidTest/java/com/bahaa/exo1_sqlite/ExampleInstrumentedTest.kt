package com.bahaa.exo1_sqlite

import androidx.room.Room
import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4
import org.junit.After
import org.junit.Assert

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import org.junit.Before

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    var firstSqlitedb : AppDatabase? = null
    @Before
    fun initDB() {
        firstSqlitedb = Room.inMemoryDatabaseBuilder(InstrumentationRegistry.getInstrumentation().context,AppDatabase::class.java).build()
    }


    @Test
    fun testInsertPlayerTeam_And_GetPlayersTeam() {

        val team = Team( "ESS","Africa")
        firstSqlitedb?.getTeamDao()?.addTeam(team)
       if (team.id_team!=null){
        val player = Player(1, "Mouad","Benyamna",22,1.5, team.id_team!!)
            firstSqlitedb?.getPlayerDao()?.addPlayer(player)

            val playerRes = firstSqlitedb?.getPlayerDao()?.getPlayersTeam("ESS")?.get(0)
            Assert.assertEquals(player,playerRes)

        }




    }

    @After
    fun closeDb(){
        firstSqlitedb?.close()
    }

}
