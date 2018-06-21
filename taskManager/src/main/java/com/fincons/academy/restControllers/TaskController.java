package com.fincons.academy.restControllers;

import org.springframework.http.ResponseEntity;

import com.fincons.academy.domain.Task;

public interface TaskController {
	ResponseEntity<?> addTask(Task task);
	ResponseEntity<?> listAllTask();
	ResponseEntity<?> getTaskById(Long id);
	ResponseEntity<?> deleteTask(Long id);
	ResponseEntity<?> updateTask(Task task);

	ResponseEntity<?> RequestMethod(Long id, String action,Task optionalTask);
	ResponseEntity<?> assignPerson(long personId, long taskId, Task optionalTask);

	

}
