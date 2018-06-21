package com.fincons.academy.services;

import com.fincons.academy.domain.Person;

public interface PersonService {
	Person addPerson(Person person) throws Exception;

	Iterable<Person> listAllPerson();

	Person getPersonById(Long id) throws Exception;

}
