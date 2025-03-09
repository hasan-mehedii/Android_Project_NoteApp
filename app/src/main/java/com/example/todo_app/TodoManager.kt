package com.example.todo_app

import java.time.Instant
import java.util.Date

object TodoManager {
    private val todoList = mutableListOf<Todo>()

    fun getAllTodo() : List<Todo>{
        // Will call either API or Database. But now will be stored in memory
        return todoList
    }

    fun addTodo(title: String){
        todoList.add(Todo(System.currentTimeMillis().toInt(), title, Date.from(Instant.now())))
    }

    fun deleteTodo(id: Int){
        todoList.removeIf{
            it.id == id
        }
    }
}