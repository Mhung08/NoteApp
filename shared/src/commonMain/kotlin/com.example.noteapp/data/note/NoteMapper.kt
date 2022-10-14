package com.example.noteapp.data.note

import com.example.noteapp.domain.note.Note
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        created = Instant
            .fromEpochMilliseconds(created)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    )
}