package com.day10.q1;

public class Student extends Person {

	int studentId;
	String courseEnrolled;
	int courseFee;
	public Student() {
		
	}
	
	public Student(int studentId, String courseEnrolled, int courseFee,String name ,String gender) {
		super(name,gender);
		this.studentId = studentId;
		this.courseEnrolled = courseEnrolled;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", courseEnrolled=" + courseEnrolled + ", courseFee=" + courseFee
		 	+ ", name=" + name + ", gender=" + gender + ", add=" + add + "]";
	}
			
			
	}

	
	

	
	

