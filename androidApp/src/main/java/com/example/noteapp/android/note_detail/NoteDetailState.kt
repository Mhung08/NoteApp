package com.example.noteapp.android.note_detail

/**
 * @Author: Hung Tran
 * @Date: 18/10/2022
 */
data class NoteDetailState(
    val noteTitle: String = "",
    val isNoteTitleHintVisible: Boolean = false,
    val noteContent: String = "",
    val isNoteContentHintVisible: Boolean = false,
    val noteColor: Long = 0xFFFFFF
)