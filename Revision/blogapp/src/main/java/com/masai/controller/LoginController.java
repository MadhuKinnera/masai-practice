package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.UserException;
import com.masai.model.MessageDTO;
import com.masai.model.User;
import com.masai.service.LoginService;

@RestController
public class LoginController {
	
	@Autowired
	private LoginService lService;
	
	
	@PostMapping("/user/register")
	public ResponseEntity<MessageDTO> registerHandler(@RequestBody User user) throws UserException{
		return new ResponseEntity<MessageDTO>(lService.register(user),HttpStatus.CREATED);
	}
	
	@PostMapping("/user/login")
	public ResponseEntity<MessageDTO> loginHandler(@RequestBody User user) throws UserException{
		return new ResponseEntity<MessageDTO>(lService.login(user),HttpStatus.OK);
	}
	

}
