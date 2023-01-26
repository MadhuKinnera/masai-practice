package com.eval3.q5;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {
	
	public static void serialize(List<Student> students) {
		
		try {
			FileOutputStream fos = new FileOutputStream("studentdata.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(students);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	public static void main(String[] args) {
		
		//serialization
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"Madhu",253,"kinneramadhu123@gmail.com","hello123",
				new Address("Telangna","warangal",506134)));
		
		students.add(new Student(12,"Pavan",343,"abc@gmail.com","password123",
				new Address("MP","hyderabad",506904)));
		
		students.add(new Student(15,"Raghu",253,"gef@gmail.com","dontknow123",
				new Address("AP","mumabai",502143)));
		students.add(new Student(8,"Ram",893,"xyz@gmail.com","nopassword",
				new Address("Delhi","delhi",506325)));
		
		students.add(new Student(6,"Prasad",479,"mno@gmail.com","forgettenpass",
				new Address("Tamilnadu","chennai",502780)));
		
		serialize(students);
		
		List<Student> newStudents = null;
		try {
			newStudents = Demo2.deserialize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	newStudents.add(new Student(11,"newStudent",999,"latest@gmail.com","idonttell",
			new Address("Rajasthan","Jaipur",50000)));
	
	serialize(newStudents);
	printStudents(newStudents);
	
		

		
		
	}
	
	public static void printStudents(List<Student> students) {

		for(Student s :students) {
			System.out.println("Roll is "+s.getRoll());
			System.out.println("Name is "+s.getName());
			System.out.println("Marks is "+s.getMarks());
			System.out.println("Email is "+s.getEmail());
			System.out.println("Password is "+s.getPassword());
			System.out.println("State is "+s.getAddress().getState());
			System.out.println("City is "+s.getAddress().getCity());
			System.out.println("Pincode is "+s.getAddress().getPincode());
			System.out.println("=====================================");
			System.out.println();
		}
			
	}

}
