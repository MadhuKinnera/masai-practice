package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepo uRepo;
	
	@Autowired
	EmailRepo eRepo;

	@Override
	public List<User> getUsers() throws UserException {
		List<User> users = uRepo.findAll();
		
		if(users.isEmpty()) {
			throw new UserException("Users Not Exist");
		}else {
			return users;
		}
		 
	}

	@Override
	public User createUser(User user) throws UserException {
		Email email = user.getEmail();
		
		eRepo.save(email);
		
		return uRepo.save(user);
		
	}

	@Override
	public User getUserById(Integer id) throws UserException {
		Optional<User> opt = uRepo.findById(id);
		
		if(opt.isPresent()) {
			return opt.get();
		}else{
			throw new UserException("User Not Found With The Id "+id);
		}
	}

	@Override
	public User deleteUserById(Integer id) throws UserException {
		Optional<User> opt =  uRepo.findById(id);
		if(opt.isPresent()) {
			uRepo.delete(opt.get());
			return opt.get();
		}else {
			throw new UserException("User Not Found With The Id "+id);
		}
	}

}
