package  com.bahaa.exo1_sqlite

import android.app.Application

class App:Application() {
    override fun onCreate() {
        super.onCreate()
        RoomService.context=applicationContext
    }
}