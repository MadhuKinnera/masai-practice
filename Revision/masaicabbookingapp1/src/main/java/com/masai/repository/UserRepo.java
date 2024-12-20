package com.masai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.model.User;

public interface UserRepo extends JpaRepository<User, String> {
	
	User findByUsername(String username);

}
