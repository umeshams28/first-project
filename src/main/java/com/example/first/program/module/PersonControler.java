package com.example.first.program.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonControler {
	
	
	@Autowired
	private PersonService personService;
	
	
	@PostMapping("/add")
	public ResponseEntity<Person> savePerson(@RequestBody Person person){
		Person person2= personService.savePerson(person);
		
		return ResponseEntity.status(HttpStatus.OK).body(person2);
	}
	
	
	
	@GetMapping("/get/{id}")
	public ResponseEntity<?> getPersonById(@PathVariable("id") int id){
		 Person person=  personService.getPersonById(id);
		 if(person!=null) {
			 return ResponseEntity.ok(person);
		 }else {
			 throw new PersonNotFoundException("in this id no person is avelabel");
		 }
		
	}
	
	

}
