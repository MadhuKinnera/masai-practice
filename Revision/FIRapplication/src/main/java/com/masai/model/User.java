package com.masai.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@Entity
public class User {
	
	@Id
	private String username;
	
    private	String lastName;
	
	private String mobileNumber;
	
	private String firstName;
	private String address;

	private Integer age;
	private String gender;
	
	private String password;
	
	@JsonIgnore
	@OneToMany(mappedBy = "user")
	List<FIR> firs = new ArrayList<>();

}
