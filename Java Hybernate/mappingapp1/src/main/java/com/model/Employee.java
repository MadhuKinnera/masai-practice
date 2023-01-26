package com.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@Entity
public class Employee  extends Person{
	
	private int salary;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name = "state", column = @Column(name="HM_state")),
		@AttributeOverride(name = "city" , column = @Column(name="HM_city")),
		@AttributeOverride(name = "pincode",column = @Column(name="HM_pincode"))
	})
	private Address homeAddress;
	
	@Embedded
	@AttributeOverrides({
		@AttributeOverride(name="state",column = @Column(name="OF_state")),
		@AttributeOverride(name="city",column = @Column(name="OF_city")),
		@AttributeOverride(name="pincode",column = @Column(name="OF_pincode"))
	})
	private Address officeAddress;
	
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Address getHomeAddress() {
		return homeAddress;
	}
	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}
	public Address getOfficeAddress() {
		return officeAddress;
	}
	public void setOfficeAddress(Address officeAddress) {
		this.officeAddress = officeAddress;
	}
	
	
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", homeAddress=" + homeAddress + ", officeAddress=" + officeAddress + "]";
	}
	
	

}
