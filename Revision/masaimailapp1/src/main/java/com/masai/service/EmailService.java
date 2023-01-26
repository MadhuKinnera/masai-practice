package com.masai.service;

import com.masai.exception.EmailException;
import com.masai.model.MailDTO;

public interface EmailService {
	
	MailDTO addMail(MailDTO mail)throws EmailException;
	
	MailDTO getMailById(Integer id)throws EmailException;
	
	MailDTO deleteMailById(Integer id) throws EmailException;

}
