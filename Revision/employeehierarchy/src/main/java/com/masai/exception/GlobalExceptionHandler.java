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
	public ResponseEntity<MyErrorDetails> EmployeeExceptionHandler(EmployeeException ex,WebRequest req){
		MyErrorDetails me = new MyErrorDetails();
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(ex.getMessage());
		me.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> ExceptionHandler(Exception ex,WebRequest req){
		MyErrorDetails me = new MyErrorDetails();
		me.setTimestamp(LocalDateTime.now());
		me.setMessage(ex.getMessage());
		me.setDescription(req.getDescription(false));
		return new ResponseEntity<MyErrorDetails>(me,HttpStatus.BAD_REQUEST);
	}
	

}