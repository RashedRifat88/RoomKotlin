package com.egsystem.roomkot

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.egsystem.roomkotlin.NoteDao
import com.egsystem.roomkotlin.NoteEntity


@Database(entities = [NoteEntity::class], version = 1)
abstract class NoteDatabase : RoomDatabase() {

    abstract fun getDao(): NoteDao

    companion object {

        private var INSTANCE: NoteDatabase? = null

        fun getDatabase(context: Context): NoteDatabase {
            var tempInstance: NoteDatabase? = INSTANCE

            if (tempInstance != null) {
                return tempInstance
            }


            synchronized(this) {
                val instance: NoteDatabase = Room.databaseBuilder(
                    context,
                    NoteDatabase::class.java,
                    "note_database"
                ).build()

                return instance
            }

        }

    }

}