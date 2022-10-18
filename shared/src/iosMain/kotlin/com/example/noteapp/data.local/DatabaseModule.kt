package com.example.noteapp.data.local

import com.example.noteapp.data.note.SqlDelightNoteDataSource
import com.example.noteapp.database.NoteDatabase
import com.example.noteapp.domain.note.NoteDataSource

/**
 * @Author: Hung Tran
 * @Date: 18/10/2022
 */
class DatabaseModule {
    private val factory by lazy { DatabaseDriverFactory() }
    val noteDataSource: NoteDataSource by lazy {
        SqlDelightNoteDataSource(NoteDatabase(factory.createDriver()))
    }
}