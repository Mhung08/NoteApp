package com.example.noteapp.data.local

import android.content.Context
import com.example.noteapp.database.NoteDatabase
import com.squareup.sqldelight.android.AndroidSqliteDriver
import com.squareup.sqldelight.db.SqlDriver

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
actual class DatabaseDriverFactory(private val context: Context) {
    actual fun createDriver(): SqlDriver {
        return AndroidSqliteDriver(NoteDatabase.Schema, context, "note.db")
    }
}