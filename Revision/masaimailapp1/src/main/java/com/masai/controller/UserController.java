package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService uService;
	
	public ResponseEntity<User> registerUser(User user) throws UserException{
		return new ResponseEntity<User>(uService.registerUser(user),HttpStatus.OK);
	}
	
	public ResponseEntity<String> loginUser(UserDTO user) throws EmailException{
		return new ResponseEntity<String>(uService.loginUser(user),HttpStatus.OK);
	}
	
	public ResponseEntity<User> getUserEmail(String email) throws UserException, EmailException{
		return new ResponseEntity<User>(uService.getUserByEmail(email),HttpStatus.OK);
	}
	
	public ResponseEntity<User> updateUser(Integer id,User user) throws UserException{
		return new ResponseEntity<User>(uService.updateUser(id, user),HttpStatus.OK);
	}

}
