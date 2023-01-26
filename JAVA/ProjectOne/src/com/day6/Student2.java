package com.day6;

public class Student2 {

	private int roll;
	private  String name;
	private String address;
	private String collageName;
	
	Student2(int roll,String name,String address){
		this.roll=roll;
		this.name=name;
		this.address=address;
	}
	Student2(int roll,String name,String address,String collageName){
		this.roll=roll;
		this.name=name;
		this.address=address;
		this.collageName=collageName;
	}
	
	
	
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCollageName() {
		return collageName;
	}
	public void setCollageName(String collageName) {
		this.collageName = collageName;
	}
	
	
	
	
	
	
	
	
	
	public static Student2 getStudent(boolean isFromNIT) {
		if(isFromNIT) {
		Student2 s1=new Student2(505,"Madhu","HNK");
			s1.collageName="NIT";
			return s1;
		}
		else {
			Student2 s1 = new Student2(503,"Raghu","HYD","SVS");
			return s1;
		}
		
	}
	
	
}
