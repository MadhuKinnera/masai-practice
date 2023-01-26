package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.MailDTO;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;
	
	
	@Autowired
	private EmailRepo eRepo;

	@Override
	public User registerUser(User user) throws UserException {
		return uRepo.save(user);
	}

	@Override
	public String loginUser(UserDTO user) throws EmailException {
	 Email email = 	eRepo.findByEmail(user.getEmail());
	 
	 if(email==null) 
		 throw new EmailException("User Doesnot exist with email "+user.getEmail());
	 
	 if(email.getPassword().equals(user.getPassword())) {
		 return "Login Success";
	 }else {
		 return "Login failed";
	 }
		   
	}

	@Override
	public User getUserByEmail(String email) throws UserException, EmailException {
	 Email e =	eRepo.findByEmail(email);
	  if(e==null) 
		  throw new EmailException("Email doesnot exist with emailid = "+email);
	  
	Optional<User> opt =  uRepo.findById(e.getUser().getId());
	
	if(opt.isEmpty())
		throw new UserException("User Not exist with email "+email);
	
	User user = opt.get();
	
	return user;	
		
	}
	

	@Override
	public List<MailDTO> getStarredEmails(Integer id) throws EmailException, UserException {
		   Optional<User> opt = uRepo.findById(id);
		   
		   if(opt.isEmpty())
			   throw new UserException("User doesnot exist with id "+id);
		   
		   User user = opt.get();
		   
		   Email email = user.getEmail();
		   
		   if(email==null)
			   throw new EmailException("Mail doesnot exist for user "+user.getFirstName());
		   
		   List<MailDTO> list = email.getInbox();
		   
		   if(list.isEmpty())
			   throw new EmailException("Inbox is empty ");
		   
		   return list;
	}

	@Override
	public User updateUser(Integer id, User user) throws UserException {
		
		 Optional<User> opt = uRepo.findById(id);
		   
		   if(opt.isEmpty())
			   throw new UserException("User doesnot exist with id "+id);
		   
		   
		 return  uRepo.save(user);
		
	}
	
	

}
