package com.day4;

public class Student {
	
	
	int roll;
	String name;
	int marks;
	
	void printStudentDetails() {
		System.out.println("Roll is :"+roll);
		System.out.println("Name is :"+name);
		System.out.println("Marks is :"+marks);
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Student s1=new Student();
		s1.roll=505;
		s1.name="Madhu";
		s1.marks=98;
		Student s2=new Student();
		s2.roll=503;
		s2.name="Raghu";
		s2.marks=90;
		s1.printStudentDetails();
		s2.printStudentDetails();
		s1=null;
		s2=null;


	}

}
