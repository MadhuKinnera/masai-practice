package com.masai.service;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.EventDTO;

public interface EventService {
	
	
	Event createEvent(Integer id, EventDTO event)throws EventException,UserException;
	
	Event updateEvent(Integer eid,Event event) throws EventException;
	
	Event deleteAnEvent(Integer eid) throws EventException;

}
