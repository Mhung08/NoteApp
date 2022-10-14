package com.example.noteapp.domain.time

import kotlinx.datetime.*

/**
 * @Author: Hung Tran
 * @Date: 14/10/2022
 */
object DateTimeUtil {

    fun now(): LocalDateTime {
        return Clock.System.now().toLocalDateTime(TimeZone.currentSystemDefault())
    }

    fun toEpochMillis(dateTime: LocalDateTime): Long {
        return dateTime.toInstant(TimeZone.currentSystemDefault()).toEpochMilliseconds()
    }
}