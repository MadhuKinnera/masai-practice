package com.masai.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.EventDTO;
import com.masai.model.User;
import com.masai.repository.EventRepo;
import com.masai.repository.UserRepo;

@Service
public class EventServiceImpl implements EventService{
	
	@Autowired
	private UserRepo uRepo;
	
	@Autowired
	private EventRepo eRepo;

	@Override
	public Event createEvent(Integer id, EventDTO event) throws EventException, UserException {
		
		Optional<User> opt = uRepo.findById(id);
		
		if(opt.isEmpty())
			throw new UserException("User Not Found with "+id+" Hence Unable to create event ");
		
		
		
		Event e = new Event();
		
		e.setName(event.getName());
		e.setEnd(event.getEnd());
		e.setStart(event.getStart());

		
		User user =opt.get();

		e.setUser(user);
		user.getEvents().add(e);
		uRepo.save(user);
		
		return eRepo.save(e);
		
		
		
	}

	@Override
	public Event updateEvent(Integer eid, Event event) throws EventException {
		Optional<Event> opt = eRepo.findById(eid);
		
		if(opt.isEmpty())
			throw new EventException("Event Not Found With id "+eid);
		
		return eRepo.save(event);
	}

	@Override
	public Event deleteAnEvent(Integer eid) throws EventException {
		Optional<Event> opt = eRepo.findById(eid);
		
		if(opt.isEmpty())
			throw new EventException("Event Not Found With id "+eid);
		
		Event event = opt.get();
		
		eRepo.delete(event);
		
		return event;
		
	}

}
