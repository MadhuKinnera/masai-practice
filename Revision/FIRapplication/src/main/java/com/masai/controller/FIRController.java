package com.masai.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exception.FIRException;
import com.masai.exception.UserException;
import com.masai.model.FIR;
import com.masai.model.FIRRegDTO;
import com.masai.service.FIRService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/masaifir/user")
public class FIRController {
	
	@Autowired
	private FIRService fService;
	
	@PostMapping("/fir")
	public ResponseEntity<FIR> createFIRHandler(@RequestParam String username,@RequestBody FIRRegDTO fir) throws FIRException, UserException{
		return new ResponseEntity<FIR>(fService.createFIR(username, fir),HttpStatus.CREATED);
	}
	

}
