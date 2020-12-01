package com.egsystem.roomkotlin

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "note_table")
data class NoteEntity (


    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "column_id")
    var id : Int,

    @ColumnInfo(name = "column_title")
    var title : String,

    @ColumnInfo(name = "column_note")
    var note : String




)