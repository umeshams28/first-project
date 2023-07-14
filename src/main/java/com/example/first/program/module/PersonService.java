package com.example.first.program.module;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

	
	@Autowired
	private PersonRepository personRepository;
	
	
	
	public Person savePerson(Person person) {
		return personRepository.save(person);
	}
	
	
	
	public Person getPersonById(int id) {
		Optional<Person> optional=  personRepository.findById(id);
		
		if(optional.isEmpty()) {
			return null;
		}
		return optional.get();
	}
}
