package com.example.noteapp.data.note

import com.example.noteapp.database.NoteDatabase
import com.example.noteapp.domain.note.Note
import com.example.noteapp.domain.note.NoteDataSource
import com.example.noteapp.domain.time.DateTimeUtil

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
class SqlDelightNoteDataSource(db: NoteDatabase) : NoteDataSource{

    private val queries = db.noteQueries
    override suspend fun insertNote(note: Note) {
        queries.insertNote(
            note.id,
            note.title,
            note.content,
            note.colorHex,
            DateTimeUtil.toEpochMillis(note.created)
        )
    }

    override suspend fun getNoteById(id: Long): Note? {
        return queries.getNoteById(id)
            .executeAsOneOrNull()?.toNote()
    }

    override suspend fun getAllNote(): List<Note> {
        return queries.getAllNotes().executeAsList().map {
            it.toNote()
        }
    }

    override suspend fun deleteNoteById(id: Long) {
        queries.deleteNoteById(id)
    }
}