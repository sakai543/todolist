package jp.co.sss.todo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.co.sss.todo.entity.Todo;
import jp.co.sss.todo.form.TodoForm;
import jp.co.sss.todo.repository.TodoRepository;

@Controller
public class TodoController {

	@Autowired
	TodoRepository repository;

	/*
	 * @RequestMapping("/index") public String layout_view() { return "index"; }
	 */

	@RequestMapping("/index")
	public String showTodoList(Model model) {
		List<Todo> list = repository.findAll();
		model.addAttribute("todos", list);
		return "index";
	}

	@RequestMapping(path = "/todos/create/complete", method = RequestMethod.POST)
	public String createComplete(TodoForm form, Model model) {
		Todo todo = new Todo();
		todo.setTitle(form.getTitle());
		todo.setLimit(form.getLimit());
		repository.save(todo);
		model.addAttribute("todos", todo);
		return "redirect:/index";
	}

	@RequestMapping(path = "/todos/update/complete/{id}", params = "update", method = RequestMethod.POST)
	public String updateComplete(@PathVariable int id, TodoForm form) {
		Todo todo = repository.getById(id);
		todo.setTitle(form.getTitle());
		todo.setLimit(form.getLimit());
		repository.save(todo);
		return "redirect:/index";
	}

	@RequestMapping(path = "/todos/update/complete/{id}", params = "delete", method = RequestMethod.POST)
	public String deleteComplete(TodoForm form) {
		repository.deleteById(form.getId());
		return "redirect:/index";
	}

}
