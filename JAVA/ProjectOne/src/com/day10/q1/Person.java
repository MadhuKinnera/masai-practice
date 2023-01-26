package com.day10.q1;

public class Person {

	String name;
	String gender;
	Address add;
	public Person() {
		
	}
	public Person(String name, String gender) {
		super();
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + ", add=" + add + "]";
	}
	
	
	
	
	
	
}
