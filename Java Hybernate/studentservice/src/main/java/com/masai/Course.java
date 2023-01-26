package com.masai;

public class Course {

	private int courseid;
	private String courseName;
	private int courseFee;
	
	public Course(int courseid, String courseName, int courseFee) {
		super();
		this.courseid = courseid;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	@Override
	public String toString() {
		return "Course [courseid=" + courseid + ", courseName=" + courseName + ", courseFee=" + courseFee + "]";
	}
	
	
	
}
