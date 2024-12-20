package com.masai.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.DriverException;
import com.masai.model.Driver;
import com.masai.service.DriverService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaicab/driver")
public class DriverController {
	
	@Autowired
	private DriverService dService;
	
	@PostMapping("/register")
	public ResponseEntity<Driver> registerDriverHandler(@RequestBody @Valid Driver driver) throws DriverException{
		return new ResponseEntity<Driver>(dService.registerDriver(driver),HttpStatus.CREATED);
	}

}
