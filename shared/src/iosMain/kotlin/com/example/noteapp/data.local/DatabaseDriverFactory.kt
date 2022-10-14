package com.example.noteapp.data.local

import com.example.noteapp.database.NoteDatabase
import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.drivers.native.NativeSqliteDriver

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
        return NativeSqliteDriver(NoteDatabase.Schema, "note.db")
    }
}