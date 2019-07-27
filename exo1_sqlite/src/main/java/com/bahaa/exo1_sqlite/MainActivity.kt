package com.bahaa.exo1_sqlite

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addButton.setOnClickListener() {

            var teamName =   teamNameTextView.text.toString()
            var teamContinent = continentTextView.text.toString()


            RoomService.appDatabase.getTeamDao().addTeam(Team(teamName,teamContinent))

            val addedName:String= RoomService.appDatabase.getTeamDao().getTeamByName(teamName).get(0).team_name.toString()

            if (   addedName.equals(teamName)){
                Toast.makeText(this,addedName+" was successfuly added", Toast.LENGTH_LONG).show()

            }


        }
    }
}
