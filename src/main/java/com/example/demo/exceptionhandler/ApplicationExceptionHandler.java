package com.example.demo.exceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.demo.model.ErrorMessageModel;

@RestControllerAdvice
public class ApplicationExceptionHandler {
	
	
	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<ErrorMessageModel> applicationExceptionHandler(ApplicationException exception){
		
		ErrorMessageModel errorMessageModel = new ErrorMessageModel();
		
		errorMessageModel.setCode(404);
		errorMessageModel.setMessage(exception.getMessage());
		return new ResponseEntity<ErrorMessageModel>(errorMessageModel, HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(Exception.class)
	public ResponseEntity<ErrorMessageModel> applicationExceptionHandler(Exception exception){
		
		ErrorMessageModel errorMessageModel = new ErrorMessageModel();
		
		exception.printStackTrace();
		errorMessageModel.setCode(404);
		errorMessageModel.setMessage("Encounted an Error..");
		return new ResponseEntity<ErrorMessageModel>(errorMessageModel, HttpStatus.NOT_FOUND);
	}
	

}
