package com.example.noteapp.domain.note

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
interface NoteDataSource {
    suspend fun insertNote(note: Note)
    suspend fun getNoteById(id: Long) : Note?
    suspend fun getAllNote() : List<Note>
    suspend fun deleteNoteById (id: Long)
}