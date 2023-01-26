package com.masai.service;

import java.util.List;

import com.masai.exception.DriverException;
import com.masai.exception.UserException;
import com.masai.model.Driver;
import com.masai.model.LoginDTO;
import com.masai.model.User;

public interface UserService {
	
	User registerUser(User user) throws UserException;
	
	String loginUser(LoginDTO login)throws UserException;
	
	List<Driver> findRides(String username) throws DriverException,UserException;
	
	User updateRide(String username,Integer did,Integer x , Integer y) throws DriverException,UserException;

}
