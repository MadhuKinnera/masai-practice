package com.day10.q1;

public class Instructor extends Person {
	int instructorId;
	int salary;
	
	public Instructor() {
		
	}
	
	public Instructor(int instructorId, int salary,String name,String gender) {
		super(name,gender);
		this.instructorId = instructorId;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", salary=" + salary + ", name=" + name + ", gender="
				+ gender + ", add=" + add + "]";
	}
	
	
	

}
