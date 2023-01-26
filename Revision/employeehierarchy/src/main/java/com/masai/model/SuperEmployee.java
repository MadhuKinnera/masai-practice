package com.masai.model;

import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@NoArgsConstructor
public class SuperEmployee {
	
	@Id
	@GeneratedValue
	private Integer empId;
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNumber;
	private Integer salary;
	
	public SuperEmployee(String firstName, String lastName, String email, String phoneNumber, Integer salary,
			Manager manager) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.salary = salary;
		this.manager = manager;
	}

	@ManyToOne(cascade = CascadeType.ALL,optional = true)
	private Manager manager;


}
