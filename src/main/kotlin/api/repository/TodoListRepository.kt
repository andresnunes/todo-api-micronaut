package api.repository

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface TodoListRepository: JpaRepository<TodoListRepository, Long> {

}