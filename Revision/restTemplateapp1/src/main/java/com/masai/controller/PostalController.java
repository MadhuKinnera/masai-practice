package com.masai.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.output.PostOfficeResponse;
import com.masai.service.PostalService;

@RestController
@RequestMapping("/postal")
public class PostalController {
	
	@Autowired
	private PostalService postalService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	
	@RequestMapping(value = "/byCity",method = RequestMethod.GET,
			consumes=MediaType.ALL_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
	public PostOfficeResponse findPostOfficesByCity(@RequestParam String city) {
		
		 return postalService.findPostOfficeByCity(city);
	}

}
