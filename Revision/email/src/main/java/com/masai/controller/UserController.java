package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.EmailDTO;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.service.EmailService;
import com.masai.service.UserService;

@RestController
public class UserController {

	@Autowired
	EmailService eservice;
	
	@Autowired
	UserService uservice;
	
	@GetMapping("/")
	public String helloHandler() {
		return "Hello Madhu";
	}
	
	
	
	@GetMapping("/users")
	public ResponseEntity<List<User>> getAllUsersHandler() throws UserException{
		
		return new ResponseEntity<List<User>>(uservice.getUsers(),HttpStatus.ACCEPTED);
		
	}
	
	
	@PostMapping("/users")
public ResponseEntity<User> createUser(@RequestBody  User user) throws UserException{
		
		return new ResponseEntity<User>(uservice.createUser(user),HttpStatus.ACCEPTED);
		
	}
   @GetMapping("/users/{id}")
  public ResponseEntity<User> getUserByIdHandler(@PathVariable("id") Integer id) throws UserException{
	
	return new ResponseEntity<User>(uservice.getUserById(id),HttpStatus.ACCEPTED);
	
}

   @DeleteMapping("/users/{id}")
public ResponseEntity<User> deleteUserByIdHandler(@PathVariable("id") Integer id) throws UserException{
	
	return new ResponseEntity<User>(uservice.deleteUserById(id),HttpStatus.ACCEPTED);
	
}

   @GetMapping("/users/{id}/mail/{mid}")
public ResponseEntity<EmailDTO> getEmailByUserHandler(@PathVariable("id") Integer id,@PathVariable("mid") Integer mid) throws UserException{
	
	return new ResponseEntity<EmailDTO>(eservice.getEmailDetails(id,mid),HttpStatus.ACCEPTED);
	
}

   @PostMapping("users/{id}/mail")
public ResponseEntity<Email> createEmailForUserHandler(@PathVariable("id") Integer id,@RequestBody Email email) throws UserException{
	
	return new ResponseEntity<Email>(eservice.createMailForUser(id, email),HttpStatus.ACCEPTED);
	
}


}
