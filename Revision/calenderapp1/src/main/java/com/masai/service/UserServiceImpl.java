package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.model.UserRegDTO;
import com.masai.repository.EventRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private EventRepo eRepo;

	@Override
	public User registerUser(UserRegDTO user) throws UserException {
		   Optional<User> opt = uRepo.findByUsername(user.getUsername());
		   
		   if(opt.isPresent())
			   throw new UserException("Username Already present ");
		   
		   User u = new User();
		   
		   u.setDob(user.getDob());
		   u.setFirstName(user.getFirstName());
		   u.setLastName(user.getLastName());
		   u.setUsername(user.getUsername());
		   u.setPassword(user.getPassword());
		   u.setPhone(user.getPhone());
		   
		   
		   return uRepo.save(u);
	}

	@Override
	public String loginUser(UserDTO userdto) throws UserException {
		Optional<User> opt = uRepo.findByUsername(userdto.getUsername());
		   
		   if(opt.isEmpty())
			   throw new UserException("Incorrect UserName "+userdto.getUsername());
		   
		   if(!opt.get().getPassword().equals(userdto.getPassword()))
			   throw new UserException("Incorrect Password "+userdto.getPassword());
		   
		   return "Login Successful ";
			   
		   
	}

	@Override
	public List<Event> getEventsByType(String type) throws EventException {
		
		List<Event> events = new ArrayList<>();
		
		//Calendar cal = Calendar.getInstance();

		
//		if(type.equals("Day")) {
//			events = eRepo.getEventsByDay(cal.DAY_OF_YEAR);
//		}else if(type.equals("Week")) {
//			events = eRepo.getEventsByWeek(cal.WEEK_OF_MONTH);
//		}else {
//			events = eRepo.getEventsByMonth(cal.MONTH);
//		}
		
//		events = eRepo.getEventsByDay(LocalDate.now());
//		
		
		if(events.isEmpty())
			throw new EventException("No events Found For Current "+type);
		
		return events;
		
	}

	@Override
	public User updateUser( User user) throws UserException {
		
		Optional<User> opt = uRepo.findById(user.getId());
		
		if(opt.isEmpty())
			throw new UserException("User Not Found ");
		
		return uRepo.save(user);
		   
		
	}

}
