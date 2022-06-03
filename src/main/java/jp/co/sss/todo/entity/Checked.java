package jp.co.sss.todo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "checked")
public class Checked {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_checked_gen")
	@SequenceGenerator(name = "seq_checked_gen", sequenceName = "seq_checked", allocationSize = 1)
	private Integer id;
	@Column
	private String title;
	@Column
	private Date limit;
	@Column
	private Integer done;

	public Integer getDone() {
		return done;
	}

	public void setDone(Integer done) {
		this.done = done;
	}

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

	public Date getLimit() {
		return limit;
	}

	public void setLimit(Date limit) {
		this.limit = limit;
	}
}
