package com.example.todo_app

import androidx.lifecycle.ViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class TodoViewModel: ViewModel() {

    private var _todoList = MutableLiveData<List<Todo>>()
    val todoList: LiveData<List<Todo>> = _todoList

    fun getAllTodo(){
        // Will call either API or Database. But now will be stored in memory
        _todoList.value = TodoManager.getAllTodo().reversed()
    }

    fun addTodo(title: String){
        TodoManager.addTodo(title)
        getAllTodo()
    }

    fun deleteTodo(id: Int){
        TodoManager.deleteTodo(id)
        getAllTodo()
    }

}