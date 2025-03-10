package com.example.todo_app.db

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.todo_app.Todo

@Dao
interface TodoDao {
    @Query("SELECT * FROM TODO ORDER BY createdAt DESC")
    fun getAllTodo(): LiveData<List<Todo>>

    @Insert
    fun addTodo(todo: Todo)

    @Query("DELETE FROM TODO WHERE id = :id")
    fun deleteTodo(id: Int)
}