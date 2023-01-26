package com.masai.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.FIRRegDTO;
import com.masai.model.User;
import com.masai.repository.FIRRepo;
import com.masai.repository.UserRepo;

@Service
public class FIRServiceImpl implements FIRService {
	
	@Autowired
	private FIRRepo fRepo;
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public FIR createFIR(String username, FIRRegDTO fir) throws FIRException,UserException {
		Optional<User> optuser = uRepo.findById(username);
		
		if(optuser.isEmpty())
			throw new UserException("User Not Found With Username "+username);
		
		User user = optuser.get();
		
		FIR f = new FIR();
		f.setCrimeDetail(fir.getCrimeDetail());
		f.setPoliceStation(fir.getPoliceStation());
		f.setTimestamp(LocalDateTime.now());
		
		user.getFirs().add(f);
		
		f.setUser(user);
		
		uRepo.save(user);
		return fRepo.save(f);
	}

}
