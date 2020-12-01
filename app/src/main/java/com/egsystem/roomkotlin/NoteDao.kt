package com.egsystem.roomkotlin

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface NoteDao {

    @Insert
    fun insertData(data: NoteEntity)


    @Query("select * from note_table order by column_id")
    fun getAllData(): List<NoteEntity>

}