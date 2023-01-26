package com.masai.service;

import java.util.List;

import com.masai.model.Session;
import com.masai.model.User;
import com.masai.model.UserDTO;


public interface UserService {
	
	User addUser(User user);
	
	List<User> getAllUsers();
	
	String login(UserDTO user);
	
	String logout(String uuid);

}
