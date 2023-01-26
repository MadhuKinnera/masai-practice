package com.masai.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
public class UserRegDTO {

	@NotNull
	private String username;
	
	@NotNull
	@Pattern(regexp = "[a-zA-Z]{3,10}$")
    private	String lastName;
	@NotNull
	@Pattern(regexp = "[0-9]{10}$")
	private String mobileNumber;
	@NotNull
	@Pattern(regexp = "[a-zA-Z]{3,10}$")
	private String firstName;
	@NotNull
	private String address;
	
	@NotNull
	@Min(9)
	private Integer age;
	@NotNull
	private String gender;
	@NotNull
	@Pattern(regexp = "[a-zA-Z0-9]{6,12}$")
	private String password;
}
