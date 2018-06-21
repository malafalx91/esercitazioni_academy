package com.fincons.academy.restControllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fincons.academy.domain.Person;
import com.fincons.academy.domain.Task;
import com.fincons.academy.restControllers.TaskController;
import com.fincons.academy.services.PersonService;
import com.fincons.academy.services.TaskService;

@Controller
@RestController      //registra una istanza
@RequestMapping("/task")  		//per raggiungerlo dall'esterno

public class TaskRestControllers implements TaskController{

	
	
	
	@Autowired  	//cercami un'istanza del tipo personService nel contesto applicativo
	private TaskService taskService;
	
	
	@Override
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<?> addTask(@RequestBody Task task) {
		try {
			Task taskNew = taskService.addTask(task);
			return ResponseEntity.ok(taskNew);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listAllTask() {
		

		//return new ResponseEntity<List<Person>>(personList, HttpStatus.OK);
		return ResponseEntity.ok(taskService.listAllTask());
	}

	@Override
	public ResponseEntity<?> getTaskById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(path="/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<?> deleteTask(Long id) {
		try {
			return ResponseEntity.ok(taskService.deleteTaskById(id));
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}

	@Override
	@RequestMapping(path="/{id}", method = RequestMethod.PUT)
	public ResponseEntity<?> updateTask(@RequestBody Task task) {
		try {
			Task taskNew = taskService.updateTask(task);
			return ResponseEntity.ok(taskNew);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}

	
	@Override
	@RequestMapping(path="/{id}", params = {"complete"}, method = RequestMethod.PATCH)
	public ResponseEntity<?> RequestMethod(@PathVariable("id") Long id, @RequestParam("action")String action, @RequestParam Task optionalTask) {
		try {
			if(action.toLowerCase().equals("complete")) {
			return ResponseEntity.ok(taskService.completeTask(taskService.getTaskById(id)));}
			return ResponseEntity.badRequest().body("ammette solo l'azione completata.");

		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		
		
	}

	@Override
	@RequestMapping(method = RequestMethod.PATCH, path = "/{id}/person/{personId}")
	public ResponseEntity<?> assignPerson(@PathVariable("personId")long personId,@PathVariable("id")long id, @RequestBody Task optionalTask) {
		try {
			return ResponseEntity.ok(taskService.assignPerson(personId, taskService.getTaskById(id)));

		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
		
	}



}
