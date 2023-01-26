package com.day15.q4;

public class Department {

	private int departmentId;
	private String departmentName;
	
	Department(){
		
	}
	
	
	Department(int departmentId,String departmentName){
		this.departmentId= departmentId;
		this.departmentName=departmentName;
	}


	public int getDepartmentId() {
		return departmentId;
	}


	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}


	public String getDepartmentName() {
		return departmentName;
	}


	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	
}
