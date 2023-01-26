package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.exception.EmailException;
import com.masai.model.Email;

public interface EmailRepo extends JpaRepository<Email, Integer> {
	
	Email findByEmail(String email)throws EmailException;

}
