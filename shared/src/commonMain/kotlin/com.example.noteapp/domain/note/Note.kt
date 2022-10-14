package com.example.noteapp.domain.note

import com.example.noteapp.presentation.*
import kotlinx.datetime.LocalDateTime

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
data class Note (
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, LightGreenHex, BabyBlueHex, VioletHex)

        fun generateRandomColor() = colors.random()
    }
}