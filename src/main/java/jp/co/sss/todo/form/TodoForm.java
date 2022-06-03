package jp.co.sss.todo.form;

public class TodoForm {
	private Integer id;
	private String title;
	private Integer done;
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

	public void setLimit(String limit) {
		this.limit = limit;
	}
}
