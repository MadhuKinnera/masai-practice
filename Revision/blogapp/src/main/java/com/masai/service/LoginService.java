package com.masai.service;

import com.masai.exception.UserException;
import com.masai.model.MessageDTO;
import com.masai.model.User;

public interface LoginService {
	
	
	MessageDTO register(User user)throws UserException;
	
	MessageDTO login(User user)throws UserException;

	
	
	
	
	
	
	
	
	

}
