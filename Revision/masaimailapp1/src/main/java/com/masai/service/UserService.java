package com.masai.service;

import java.util.List;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.MailDTO;
import com.masai.model.User;
import com.masai.model.UserDTO;

public interface UserService {
	
	User registerUser(User user)throws UserException;
	
	String loginUser(UserDTO user)throws EmailException;
	
	User getUserByEmail(String email)throws UserException,EmailException;
	
	List<MailDTO> getStarredEmails(Integer id) throws EmailException,UserException;
	
	User updateUser(Integer id, User user)throws UserException;
	

	
}
