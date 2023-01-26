package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDTO;
import com.masai.model.User;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaicab/user")
public class UserController {
	
	@Autowired
    private	UserService uService;
	
	

	

	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody @Valid User user) throws UserException{
		return new ResponseEntity<User>(uService.registerUser(user),HttpStatus.CREATED);
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUserHandler(@RequestBody LoginDTO login ) throws UserException{
		return new ResponseEntity<String>(uService.loginUser(login),HttpStatus.OK);
	}
	
	@GetMapping("/findride")
	public ResponseEntity<List<Driver>> findRideHandler(@RequestParam String username) throws DriverException, UserException{
		return new ResponseEntity<List<Driver>>(uService.findRides(username),HttpStatus.OK);
	}
	
	@PutMapping("/book/{did}/{x}/{y}")
	public ResponseEntity<User> updateRideHandler(@RequestParam("username") String username,@PathVariable("did") Integer did,@PathVariable("x") Integer x ,@PathVariable("y") Integer y) throws DriverException, UserException{
		return new ResponseEntity<User>(uService.updateRide(username, did, x, y),HttpStatus.OK);
	}
	

}
