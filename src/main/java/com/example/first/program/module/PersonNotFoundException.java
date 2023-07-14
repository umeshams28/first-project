package com.example.first.program.module;

public class PersonNotFoundException extends RuntimeException{

	
	private String message;

	
	public PersonNotFoundException() {
		
	}
	public PersonNotFoundException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	
}
