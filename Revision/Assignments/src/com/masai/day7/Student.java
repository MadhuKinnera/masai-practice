package com.masai.day7;

import java.io.Serializable;

public class Student extends Person implements Serializable{
	
	private Integer roll;
	private Integer marks;
	
	public Student() {
		// TODO Auto-generated constructor stub
	}

	

	public Student(Integer id, String name, Integer age,Integer roll, Integer marks) {
		super(id, name, age);
		this.roll=roll;
		this.marks = marks;
	}



	public Integer getRoll() {
		return roll;
	}

	public void setRoll(Integer roll) {
		this.roll = roll;
	}

	public Integer getMarks() {
		return marks;
	}

	public void setMarks(Integer marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [roll=" + roll + ", marks=" + marks + "]";
	}
	
	

}
