package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import lombok.Data;

@Data
@Entity
public class Driver {
	
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{3,15}$")
	private String username;
	
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{5,10}$")
	private String vehicleNumber;
	
	@NotNull
	private Integer pos_x;
	
	@NotNull
	private Integer pos_y;
	
	@NotNull
	@Pattern(regexp = "^[a-zA-Z0-9]{6,12}$")
	private String password;
	

}
