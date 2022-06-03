package jp.co.sss.todo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_todos_gen")
	@SequenceGenerator(name = "seq_todos_gen", sequenceName = "seq_todos", allocationSize = 1)
	private Integer id;
	@Column
	private String title;
	@Column
	private Integer done;
	@Column
	private String limit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getDone() {
		return done;
	}

	public void setDone(Integer done) {
		this.done = done;
	}

	public String getLimit() {
		return limit;
	}

	public void setLimit(String date) {
		this.limit = date;
	}

}
