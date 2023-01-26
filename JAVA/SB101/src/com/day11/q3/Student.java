package com.day11.q3;

import java.io.Serializable;

public class Student implements Serializable{
	
  transient	int roll;
	String name;
	int score;
	
	public Student() {
		
	}

	public Student(int roll, String name) {
		super();
		this.roll = roll;
		this.name = name;
	}
	
	
	
	

}
