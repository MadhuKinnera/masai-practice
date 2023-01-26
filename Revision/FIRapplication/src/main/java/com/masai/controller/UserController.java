package com.masai.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;
import com.masai.service.UserService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaifir/user")
public class UserController {
	
	@Autowired
	private UserService uService;
	
	
	@PostMapping("/register")
	public ResponseEntity<User> registerUserHandler(@RequestBody @Valid UserRegDTO user) throws UserException{
		return new ResponseEntity<User>(uService.registerUser(user),HttpStatus.CREATED);	
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> loginUserHandler(@RequestBody UserDTO user) throws UserException{
		return new ResponseEntity<String>(uService.loginUser(user),HttpStatus.OK);
	}
	
	@GetMapping("/fir")
	public ResponseEntity<List<FIR>> getFIRListHandler(@RequestParam String username) throws UserException, FIRException{
		return new ResponseEntity<List<FIR>>(uService.getAllFIRs(username),HttpStatus.OK);
	}
	
	@DeleteMapping("/fir/{fid}")
	public ResponseEntity<FIR> deleteFIRByIdHandler(@PathVariable Integer fid) throws FIRException{
		return new ResponseEntity<FIR>(uService.deleteFIRbyId(fid),HttpStatus.OK);
	}

}
