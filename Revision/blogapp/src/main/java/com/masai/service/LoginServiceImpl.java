package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.UUIDEditor;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.MessageDTO;
import com.masai.model.User;
import com.masai.repository.LoginRepo;


@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	private LoginRepo lRepo;
	
	
	@Override
	public MessageDTO register(User user)throws UserException {
		User u = lRepo.findByUsername(user.getUsername());
		if(u!=null)
			throw new UserException("Username Already Exist ");
		
		lRepo.save(user);
		MessageDTO md = new MessageDTO();
		
		md.setTimestamp(LocalDateTime.now());
		md.setMessage("Registration Successful");
		return md;
			
		
		 
	}

	@Override
	public MessageDTO login(User user) throws UserException {
		User u = lRepo.findByUsername(user.getUsername());
		if(u==null)
			throw new UserException("Incorrect Username ");
		
//		
//		if(u.getPassword()!=user.getPassword())
//			throw new UserException("Incorrect Password ");
		
		 MessageDTO md = new MessageDTO();
		  
		  md.setMessage("Login success");
		  md.setTimestamp(LocalDateTime.now());
		  return md;
		 
	}


}
