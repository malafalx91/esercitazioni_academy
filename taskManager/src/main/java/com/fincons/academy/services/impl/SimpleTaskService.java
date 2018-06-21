package com.fincons.academy.services.impl;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincons.academy.domain.Person;
import com.fincons.academy.domain.Task;
import com.fincons.academy.repositories.impl.PersonRepository;
import com.fincons.academy.repositories.impl.TaskRepository;
import com.fincons.academy.services.TaskService;

@Service
public class SimpleTaskService implements TaskService {

	@Autowired
	private TaskRepository taskRepository;
	@Autowired // cerca una istanzadi questo tipo all'interno dell'applicazione e la inietta se
				// la trova nella variabile dichiarata
	private PersonRepository personRepository;

	@Override
	public Task addTask(Task task) throws Exception {
		Person person = new Person(0L, "", "");
		task.setAssignment(person);
		return taskRepository.create(task);
	}

	@Override
	public Iterable<Task> listAllTask() {
		return taskRepository.select();
	}

	@Override
	public Task getTaskById(Long id) throws Exception {
		return taskRepository.read(id);

	}

	@Override
	public Task deleteTaskById(Long id) throws Exception {
		return taskRepository.delete(id);

	}

	@Override
	public Task updateTask(Task task) throws Exception {
		return taskRepository.update(task);
	}

	@Override
	public Task completeTask(Task task) throws Exception {
		if (task.getAssignment() != null) {
			task.setCompleted(true);
			task.setCompleteOn(LocalDateTime.now());
			return taskRepository.update(task);
		}

		throw new Exception("Non può essere completato senza assegnarlo");
	}

	@Override
	public Task assignPerson(long personId, Task task) throws Exception {

		Person personToAssign = personRepository.read(personId);
		task.setAssignment(personToAssign);
		return taskRepository.update(task);
	}

}
