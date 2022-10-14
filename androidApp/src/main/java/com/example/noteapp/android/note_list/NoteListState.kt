package com.example.noteapp.android.note_list

import com.example.noteapp.domain.note.Note

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean
)