package com.masai.q3;

public class College {
	private String collegeName;
	private Student student;
	private String collegeAddress;
	
	public void show() {
		System.out.println("College Name is "+collegeName);
		System.out.println("College Address is "+collegeAddress);
		System.out.println("Student is "+student);
	}
	
	
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public String getCollegeAddress() {
		return collegeAddress;
	}
	public void setCollegeAddress(String collegeAddress) {
		this.collegeAddress = collegeAddress;
	}
	
	
	

}
