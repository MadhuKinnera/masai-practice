package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmailException;
import com.masai.model.MailDTO;
import com.masai.repository.EmailRepo;
import com.masai.repository.UserRepo;


public class EmailServiceImpl implements EmailService{
	
	
	private EmailRepo eRepo;
	
	private UserRepo uRepo;

	@Override
	public MailDTO addMail(MailDTO mail) throws EmailException {
    return null;
	}

	@Override
	public MailDTO getMailById(Integer id) throws EmailException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MailDTO deleteMailById(Integer id) throws EmailException {
		// TODO Auto-generated method stub
		return null;
	}

}
