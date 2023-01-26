package com.masai.service;

import java.util.List;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;

public interface UserService {
	
	User registerUser(UserRegDTO user)throws UserException;
	
	String loginUser(UserDTO user) throws UserException;
	
	List<FIR> getAllFIRs(String username) throws UserException,FIRException;
	
	FIR deleteFIRbyId(Integer id)throws FIRException;
	

}
