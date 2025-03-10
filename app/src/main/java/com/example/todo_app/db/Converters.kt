package com.example.todo_app.db

import java.util.Date
import androidx.room.TypeConverter
import androidx.room.TypeConverters

class Converters {
    @TypeConverter
    fun fromDate(date: Date): Long {
        return date.time
    }

    @TypeConverter
    fun toDate(time :Long): Date{
        return Date(time)
    }
}