package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@PostMapping("/users/add")
	public ResponseEntity<User> addUserHandler(@RequestBody User user){
		return new ResponseEntity<User>(uService.addUser(user),HttpStatus.CREATED);
	}
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsersHandler(){
		return new ResponseEntity<List<User>>(uService.getAllUsers(),HttpStatus.OK);
	}
    @PostMapping("/users/login")
	public ResponseEntity<String> loginHandler(@RequestBody UserDTO user){
		return new ResponseEntity<String>(uService.login(user),HttpStatus.OK);
	}
	
    @PostMapping("/users/logout")
	public ResponseEntity<String> logout(@RequestParam String uuid){
		return new ResponseEntity<String>(uService.logout(uuid),HttpStatus.OK);
	}

}
