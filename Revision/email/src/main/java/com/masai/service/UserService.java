package com.masai.service;

import java.util.List;

import com.masai.exception.UserException;
import com.masai.model.User;

public interface UserService {
	
	public List<User> getUsers()throws UserException;
	
	public User createUser(User user) throws UserException;
	
	public User getUserById(Integer id) throws UserException;
	
	public User deleteUserById(Integer id) throws UserException;
	
	

}
