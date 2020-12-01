package com.egsystem.roomkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.egsystem.roomkot.NoteDatabase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var database: NoteDao = NoteDatabase.getDatabase(application).getDao()

        val insertThread = Thread {
            database.insertData(NoteEntity(5, "note1", "title1"))
        }
        insertThread.start()


        val getDataThread = Thread {
            Log.d("tagRifat","All Data: "+ database.getAllData())
        }
        getDataThread.start()


    }
}