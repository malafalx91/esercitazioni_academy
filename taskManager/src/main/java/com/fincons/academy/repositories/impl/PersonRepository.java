package com.fincons.academy.repositories.impl;

import org.springframework.stereotype.Repository;

import com.fincons.academy.domain.Person;

@Repository
public class PersonRepository extends GenericSimpleRepository<Person> {

	public PersonRepository() throws Exception {
		super();
		
		create(new Person(1L,"Davide","Aresta"));
		create(new Person(2L,"Francesco","Zingaro"));
		create(new Person(3L,"Luciano","Volpe"));
	}
	

}
