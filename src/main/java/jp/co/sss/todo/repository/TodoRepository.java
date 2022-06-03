package jp.co.sss.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Integer> {

}
