package com.fincons.academy.restControllers.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fincons.academy.domain.Person;
import com.fincons.academy.restControllers.PersonController;
import com.fincons.academy.services.PersonService;
import com.sun.mail.imap.protocol.BODY;


@RestController      //registra una istanza
@RequestMapping("/person")  		//per raggiungerlo dall'esterno
public class PersonRestControllers implements PersonController{

	private final static Logger LOGGER = LoggerFactory.getLogger(PersonController.class);  // costante perchè final static
	
	@Autowired  	//cercami un'istanza del tipo personService nel contesto applicativo
	private PersonService personService;
	
	@Override
	@RequestMapping(method= RequestMethod.POST)
	public ResponseEntity<?> addPerson(@RequestBody Person person) {
		try {
			Person personNew = personService.addPerson(person);
			return ResponseEntity.ok(personNew);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e);
		}
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<?> listAllPersons() {
		
		LOGGER.info("recupero tutte le persone");

		//return new ResponseEntity<List<Person>>(personList, HttpStatus.OK);
		return ResponseEntity.ok(personService.listAllPerson());
	}

	@Override
	@RequestMapping(path="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> getPersonById(@PathVariable("id") Long id) {
		try {
			return ResponseEntity.ok(personService.getPersonById(id));
		}
		catch(Exception e)
		{
			return ResponseEntity.badRequest().body(e);
		}
	}


}
