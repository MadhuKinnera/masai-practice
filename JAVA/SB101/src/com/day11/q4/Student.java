package com.day11.q4;

import java.io.Serializable;

public class Student implements Serializable{

	int roll;
	String name;
	int marks;
	Address address;
	public Student(int roll, String name, int marks, Address address) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", address=" + address + "]";
	}
	
	
	
}
