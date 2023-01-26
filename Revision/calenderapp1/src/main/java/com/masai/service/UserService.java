package com.masai.service;

import java.util.List;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;

public interface UserService {
	
	User registerUser(UserRegDTO user)throws UserException;
	
	String loginUser(UserDTO userdto) throws UserException;
	
	List<Event> getEventsByType(String type)throws EventException;
	
	User updateUser(User user)throws UserException;
	
	

}
