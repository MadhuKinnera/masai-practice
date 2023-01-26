package com.model;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.ManyToAny;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int roll;
	
	private String name;
	private String mobile;
	private String email;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	private College college;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	public Student(String name, String mobile, String email, College college) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.email = email;
		this.college = college;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public College getCollege() {
		return college;
	}

	public void setCollege(College college) {
		this.college = college;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", mobile=" + mobile + ", email=" + email+"]";
	}
	
	
	
	
	

}
