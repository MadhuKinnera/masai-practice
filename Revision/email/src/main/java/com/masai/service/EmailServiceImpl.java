package com.masai.service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.EmailDTO;
import com.masai.exception.UserException;
import com.masai.model.Email;
import com.masai.model.User;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;

@Service
public class EmailServiceImpl implements EmailService{

	@Autowired
	EmailRepo eRepo;
	
	@Autowired
	UserRepo uRepo;
	
	@Override
	public EmailDTO getEmailDetails(Integer uid, Integer mid) throws UserException {
		Optional<User> opt1 = uRepo.findById(uid);
		Optional<Email> opt2 = eRepo.findById(mid);
		
		if(opt1.isPresent() && opt2.isPresent()) {
			User user = opt1.get();
			Email email = opt2.get();
			EmailDTO edto = new EmailDTO();
			edto.setCreated_date(email.getCreated_date());
			edto.setDateOfBirth(user.getDateOfBirth());
			edto.setEmail(email.getEmail());
			edto.setId(user.getId());
			edto.setMail_id(email.getMail_id());
			edto.setName(user.getName());
			edto.setPhoneNo(user.getPhoneNo());
	
			return edto;
		}else {
			throw new UserException("Incorrect Id's Provided ");
		}
	}

	@Override
	public Email createMailForUser(Integer id,Email email) throws UserException {
	   Optional<User> opt = uRepo.findById(id);
	   
	   
	   if(opt.isPresent()) {
			User user = opt.get();
		    Optional<Email> opt2 = eRepo.findById(email.getMail_id());
		    Email e = opt2.get();
		    e.setCreated_date(email.getCreated_date());
		    e.setEmail(email.getEmail());
		    e.setUser(user);
		    eRepo.save(e);
		    uRepo.save(user);
		    
		    return e;
		   
	   }else {
		   throw new UserException("User Not Found ");
	   }
	   
		
	
		
	}

}
