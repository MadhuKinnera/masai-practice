package com.masai.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.model.Session;
import com.masai.model.User;
import com.masai.model.UserDTO;
import com.masai.repository.SessionRepo;
import com.masai.repository.UserRepo;

@Service
public class UserServiceImpl  implements UserService{

	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private SessionRepo sRepo;
	
	
	@Override
	public User addUser(User user) {
		return uRepo.save(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		return uRepo.findAll();
	}

	@Override
	public String login(UserDTO user) {
		User u = uRepo.findByUsername(user.getUsername());
		if(u==null) return "Invalid Username";
		if(!u.getPassword().equals(user.getPassword())) {
			return "Invalid Password";
		}
		
		Session session = new Session();
		session.setTime(LocalDateTime.now());
		session.setUserid(u.getUserid());
		UUID uuid = UUID.randomUUID();
		session.setUuid(uuid.toString().substring(0,6));
		sRepo.save(session);
		return session.toString();
	}

	@Override
	public String logout(String uuid) {
	Session session =	sRepo.findByUuid(uuid);
	if(session!=null) {
		sRepo.delete(session);
		return "delete Success";
	}else {
		return "delete failed";
	}
	
	}

}
