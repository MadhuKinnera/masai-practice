package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDTO;
import com.masai.model.User;
import com.masai.repository.DriverRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private DriverRepo dRepo;

	@Override
	public User registerUser(User user) throws UserException {
		
		User u = uRepo.findByUsername(user.getUsername());
		if(u!=null)
			throw new UserException("User already exist ");
		
		 return uRepo.save(user);
	}

	@Override
	public List<Driver> findRides(String username) throws DriverException,UserException {
		User user = uRepo.findByUsername(username);
		if(user==null)
			throw new UserException("User Not Found with username"+username);
		
		 
		 List<Driver> drivers = dRepo.findAll();
		 
		 Integer u1 = user.getPos_x();
		 Integer u2 = user.getPos_y();
		 
		 List<Driver> updatedList = new ArrayList<>();
		 
		 for(Driver d : drivers) {
			Integer d1 = d.getPos_x();
			Integer d2 = d.getPos_y();
			Double res = Math.pow((Math.pow(d1-u1, 2)+Math.pow(d2-u2, 2)),0.5);
			
			if(res<=5) {
				updatedList.add(d);
			}
		 }
		 
		 if(updatedList.isEmpty())
			 throw new DriverException("No Drivers Found In 5 KM Range ");
		 
		 return updatedList;
		 
	}

	@Override
	public User updateRide(String username, Integer did, Integer x, Integer y) throws DriverException, UserException {
		
		User user = uRepo.findByUsername(username);
		if(user==null) 
			throw new UserException("User Not Found with username "+username);
		
		Optional<Driver> opt = dRepo.findById(did);
		
		if(opt.isEmpty())
			throw new DriverException("Driver Not Found with id "+did);
		
		   user.setPos_x(x);
		   user.setPos_y(y);
		
		return uRepo.save(user);
		
		
	}

	@Override
	public String  loginUser(LoginDTO login) throws UserException {
		User user = uRepo.findByUsername(login.getUsername());
		
		if(user==null) 
			throw new UserException("Incorrect Username ");
		
		if(!user.getPassword().equals(login.getPassword()))
			throw new UserException("Incorrect Password ");
		
		return user+" Login Success";
	}

}
