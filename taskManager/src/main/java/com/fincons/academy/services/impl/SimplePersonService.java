package com.fincons.academy.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fincons.academy.domain.Person;
import com.fincons.academy.repositories.impl.PersonRepository;
import com.fincons.academy.services.PersonService;

@Service
public class SimplePersonService implements PersonService {

	@Autowired
	private PersonRepository personRepository;

	@Override
	public Person addPerson(Person person) throws Exception {
		return personRepository.create(person);

	}

	@Override
	public Iterable<Person> listAllPerson() {

		return personRepository.select();
	}

	@Override
	public Person getPersonById(Long id) throws Exception {
		return personRepository.read(id);
	}

}
