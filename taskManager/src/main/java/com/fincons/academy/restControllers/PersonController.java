package com.fincons.academy.restControllers;

import org.springframework.http.ResponseEntity;

import com.fincons.academy.domain.Person;

public interface PersonController {
	ResponseEntity<?> addPerson(Person person);

	ResponseEntity<?> listAllPersons();

	ResponseEntity<?> getPersonById(Long id);

}
