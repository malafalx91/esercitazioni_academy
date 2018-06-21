package com.fincons.academy.services;

import com.fincons.academy.domain.Task;

public interface TaskService {
	Task addTask(Task task) throws Exception;
	Iterable<Task> listAllTask();
	Task updateTask(Task task) throws Exception;
	Task getTaskById(Long id) throws Exception;
	Task deleteTaskById(Long id) throws Exception;
	
	
	Task completeTask(Task task) throws Exception;
	Task assignPerson(long personId, Task task) throws Exception;

}
