package com.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;

@Entity
@Inheritance
public class SalariedEmployee extends Employee {
	
	private int salary;
	private String email;
	
	public SalariedEmployee() {
		// TODO Auto-generated constructor stub
	}
	



	public SalariedEmployee(int salary, String email) {
		super();
		this.salary = salary;
		this.email = email;
	}







	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}



	@Override
	public String toString() {
		return "SalariedEmployee [salary=" + salary + ", email=" + email + ", getEmpId()=" + getEmpId()
				+ ", getEmpName()=" + getEmpName();
	}


	

}
