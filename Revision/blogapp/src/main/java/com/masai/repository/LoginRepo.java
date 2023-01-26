package com.masai.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.masai.model.User;

@Repository
public interface LoginRepo extends JpaRepository<User, Integer>{
	
	User findByUsername(String username);
	

}
