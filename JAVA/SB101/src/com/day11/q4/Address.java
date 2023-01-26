package com.day11.q4;

import java.io.Serializable;

public class Address implements Serializable{
	
	String state;
	String city;
	int pincode;
	public Address(String state, String city, int pincode) {
		super();
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}
	
	

}
