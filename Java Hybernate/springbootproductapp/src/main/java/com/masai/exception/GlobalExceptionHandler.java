package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails>  myProductExceptionHandler(ProductException e , WebRequest req){
	
		MyErrorDetails me = new MyErrorDetails();
		me.setLocaldate(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDesciption(req.getDescription(false));
		
	    return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);	
		
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorDetails>  myIllegalArgumentHandler(IllegalArgumentException e , WebRequest req){
	
		MyErrorDetails me = new MyErrorDetails();
		me.setLocaldate(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDesciption(req.getDescription(false));
		
	    return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);	
		
	}
	

	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> myExceptionHandler(Exception e,WebRequest req){
		MyErrorDetails me = new MyErrorDetails();
		me.setLocaldate(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDesciption(req.getDescription(false));
		
	    return new ResponseEntity<>(me,HttpStatus.BAD_REQUEST);	
	}
}
