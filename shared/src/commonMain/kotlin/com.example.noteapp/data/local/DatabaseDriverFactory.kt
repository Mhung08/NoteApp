package com.example.noteapp.data.local

import com.squareup.sqldelight.db.SqlDriver

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
expect class DatabaseDriverFactory {
    fun createDriver(): SqlDriver
}