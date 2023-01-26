package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class UserController {
	
	
	@Autowired
	private UserService uService;
	
	
	@PostMapping("/masaicalender/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody @Valid UserRegDTO user) throws UserException{
		return new ResponseEntity<User>(uService.registerUser(user),HttpStatus.CREATED);
	}
	
	
	@PostMapping("/masaicalender/login")
	public ResponseEntity<String> loginUserHandler(@RequestBody UserDTO userdto) throws UserException{
		return new ResponseEntity<String>(uService.loginUser(userdto),HttpStatus.OK);
	}
	
	
	@GetMapping("/masaicalender/event/{type}")
	public ResponseEntity<List<Event>> getEventsByTypeHandler(@PathVariable String type) throws EventException{
		return new ResponseEntity<List<Event>>(uService.getEventsByType(type),HttpStatus.OK);
	}
	
	
	@PutMapping("/masaicalender/user")
	public ResponseEntity<User> updateUserHandler(@RequestBody User user) throws UserException{
		return new ResponseEntity<User>(uService.updateUser(user),HttpStatus.OK);
	}

}
