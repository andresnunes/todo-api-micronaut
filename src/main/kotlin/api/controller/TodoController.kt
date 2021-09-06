package api.controller

import api.model.TodoItem
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Post

@Controller("/todos")
class TodoListController {

    @Get
    fun getTodos(): List<TodoItem>{

    }

    @Post
    fun addTodo(todo: TodoItem): TodoItem{

    }
}