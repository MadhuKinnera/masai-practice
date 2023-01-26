package com.masai.model;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class UserRegDTO {
	
	private String firstName;
	private String lastName;
	private String username;
	private String password;
	private String phone;
	@DateTimeFormat(pattern = "dd-MM-yyyy")
	private LocalDate dob;

}
