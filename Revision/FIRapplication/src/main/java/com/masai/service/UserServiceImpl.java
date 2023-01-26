package com.masai.service;

import java.time.LocalDateTime;
import java.time.Period;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.support.PeriodicTrigger;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;
import com.masai.repository.FIRRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private FIRRepo fRepo;

	@Override
	public User registerUser(UserRegDTO user) throws UserException {
		 Optional<User> opt = uRepo.findById(user.getUsername());
		 
		 if(opt.isPresent())
			 throw new UserException("User Already Exist ");
		 
		 User u = new User();
		 
		 u.setAddress(user.getAddress());
		 u.setAge(user.getAge());
		 u.setFirstName(user.getFirstName());
		 u.setLastName(user.getLastName());
		 u.setGender(user.getGender());
		 u.setMobileNumber(user.getMobileNumber());
		 u.setPassword(user.getPassword());
		 u.setUsername(user.getUsername());
		 
		 
		  return uRepo.save(u);
	}

	@Override
	public String loginUser(UserDTO user) throws UserException {
     Optional<User> opt = uRepo.findById(user.getUsername());
		 
		 if(opt.isEmpty())
			 throw new UserException("Incorrect Username "+user.getUsername());
		 if(!opt.get().getPassword().equals(user.getPassword()))
			 throw new UserException("Incorrect Password "+user.getPassword());
		 
		 return "Login Success";
			 
	}

	@Override
	public List<FIR> getAllFIRs(String username) throws UserException, FIRException {
		  Optional<User> opt = uRepo.findById(username);
		  if(opt.isEmpty())
			  throw new UserException("User Not Found with username "+username);
		  
		  User user = opt.get();
		  
		  List<FIR> list = user.getFirs();
		  if(list.isEmpty())
			  throw new UserException("No FIR's Found For the User "+user.getFirstName()+" "+user.getLastName());
		  
		  return list;
	}

	@Override
	public FIR deleteFIRbyId(Integer id) throws FIRException {
		 
		 Optional<FIR> opt = fRepo.findById(id);
		  if(opt.isEmpty())
			  throw new FIRException("FIR Not Found with username "+id);
		  
		 
		  FIR fir = opt.get();
		  
		     int diff = (int) Math.abs((fir.getTimestamp().getHour() - LocalDateTime.now().getHour()));
		     
		     if(diff<=24)
		      fRepo.delete(fir);
		     else
		    	 throw new FIRException("FIR Registered Before 24 Hours");
		     

		  return fir;
		  
	}

}
