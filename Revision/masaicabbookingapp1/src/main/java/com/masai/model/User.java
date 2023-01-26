package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{3,15}$")
	private String username;
	@Pattern(regexp = "^[a-zA-Z]{3,10}$")
	@NotNull
	private String firstName;
	
	@NotNull
	@Pattern(regexp = "^[a-zA-Z]{3,10}$")
	private String lastName;
	
    @NotNull
	@Pattern(regexp = "^[0-9]{10}$")
	private String mobile;
    @NotNull
	private Integer pos_x;
    @NotNull
	private Integer pos_y;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$")
	private String password;

}
