package com.masai.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class LoginDTO {
	
	
	private String username;
	private String password;

}
