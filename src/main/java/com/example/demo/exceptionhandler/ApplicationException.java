package com.example.demo.exceptionhandler;

public class ApplicationException extends RuntimeException{
	
	public ApplicationException(String message) {
		super();
		this.message = message;
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}
