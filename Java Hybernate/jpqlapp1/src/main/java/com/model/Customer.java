package com.model;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

@Entity(name="cust")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cid;
	
	private String name;
	private String mobileNumber;
	private String email;
	
	@ElementCollection
	@Embedded
	@JoinTable(name="cust_adr",joinColumns = @JoinColumn(name="cust_id"))
	private List<Address> addresses; // Has-A relationship
	
	public Customer() {
		
	}

	public Customer( String name, String mobileNumber, String email,List<Address> list) {
		super();
		this.name = name;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.addresses= list;
	}


	public int getCid() {
		return cid;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + ", mobileNumber=" + mobileNumber + ", email=" + email
				+ ", addresses=" + addresses + "]";
	}
	
	

}
