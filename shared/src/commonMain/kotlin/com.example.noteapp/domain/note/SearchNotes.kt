package com.example.noteapp.domain.note

import com.example.noteapp.domain.time.DateTimeUtil

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
class SearchNotes {

    fun execute(notes: List<Note>, query: String) : List<Note> {
        if(query.isBlank()){
            return notes
        }

        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy {
            DateTimeUtil.toEpochMillis(it.created)
        }
    }
}