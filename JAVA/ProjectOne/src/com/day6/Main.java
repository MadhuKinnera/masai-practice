package com.day6;

public class Main {

	public static void main(String[] args) {
		Student s1=new Student(505,"madhu",20,300);
		Student s2=new Student();
		s2.setAge(30);
		s2.setMarks(300);
		s2.setName("Raghu");
		s2.setRoll(503);
		System.out.println("Roll is : "+s1.getRoll());
		System.out.println("Name is : "+s1.getName());
		System.out.println("Age is : "+s1.getAge());
		System.out.println("Marks is : "+s1.getMarks());
		System.out.println("===============");
		System.out.println("Roll is : "+s2.getRoll());
		System.out.println("Name is : "+s2.getName());
		System.out.println("Age is : "+s2.getAge());
		System.out.println("Marks is : "+s2.getMarks());
		

	}

}
