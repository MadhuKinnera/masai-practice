package com.masai.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	@ExceptionHandler(EmployeeException.class)
	public ResponseEntity<MyErrorDetails> MyEmployeeExceptionHandler(EmployeeException e,WebRequest req) {
		MyErrorDetails  me = new MyErrorDetails();
		
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(IllegalArgumentException.class)
	public ResponseEntity<MyErrorDetails> MyIlegalArgumentExceptionHandler(IllegalArgumentException e,WebRequest req) {
		MyErrorDetails  me = new MyErrorDetails();
		
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
		
	}
	
	
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> MyExceptionHandler(Exception e,WebRequest req) {
		MyErrorDetails  me = new MyErrorDetails();
		
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(e.getMessage());
		me.setDescription(req.getDescription(false));
		
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
		
	}

}
