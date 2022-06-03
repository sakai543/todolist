package jp.co.sss.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.co.sss.todo.entity.Checked;

public interface CheckedRepository extends JpaRepository<Checked, Integer> {

}
