package com.masai.service;

import com.masai.dto.EmailDTO;
import com.masai.exception.UserException;
import com.masai.model.Email;

public interface EmailService {
	
	public EmailDTO getEmailDetails(Integer uid,Integer mid)throws UserException;
	
	public Email createMailForUser(Integer id,Email email) throws UserException;
	

}
