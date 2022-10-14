package com.example.noteapp.android.note_list

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.noteapp.domain.note.Note
import com.example.noteapp.domain.note.NoteDataSource
import com.example.noteapp.domain.note.SearchNotes
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
@HiltViewModel
class NoteListViewModel @Inject constructor(
    private val noteDataSource: NoteDataSource,
    private val savedStateHandle: SavedStateHandle
): ViewModel() {

    private val searchNotes = SearchNotes()

    private val notes = savedStateHandle.getStateFlow("notes", emptyList<Note>())
    private val searchText = savedStateHandle.getStateFlow("searchText", "")
    private val isSearchActive = savedStateHandle.getStateFlow("isSearchActive", false)
}