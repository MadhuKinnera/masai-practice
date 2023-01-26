package com.masai.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.masai.model.SecurityUser;
import com.masai.model.User;
import com.masai.repository.UserRepo;

@Service
public class UserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UserRepo uRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = uRepo.findByUsername(username);
		
		
		if(user==null) 
			throw new UsernameNotFoundException("User Not Found ");
		
		return new SecurityUser(user);
		
	}

}
