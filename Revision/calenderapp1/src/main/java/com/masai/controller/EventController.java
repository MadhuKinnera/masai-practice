package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.EventException;
import com.masai.exception.UserException;
import com.masai.model.Event;
import com.masai.model.EventDTO;
import com.masai.service.EventService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EventController {

	@Autowired
	private EventService eService;
	
	@PostMapping("/masaicalender/event/{uid}")
	public ResponseEntity<Event> createEventHander(@PathVariable Integer uid,@RequestBody @Valid EventDTO event) throws EventException, UserException{
		return new ResponseEntity<Event>(eService.createEvent(uid, event),HttpStatus.CREATED);
	}
	
	@PutMapping("/masaicalender/event/{id}")
	public ResponseEntity<Event> updateEventHandler(@PathVariable Integer eid,@RequestBody Event event) throws EventException{
		return new ResponseEntity<Event>(eService.updateEvent(eid, event),HttpStatus.OK);
	}
	
	@DeleteMapping("/masaicalender/event/{id}")
	public ResponseEntity<Event> deleteEventHandler(@PathVariable Integer id ) throws EventException{
		return new ResponseEntity<Event>(eService.deleteAnEvent(id),HttpStatus.OK);
	}
	
}
