package com.masai.day7;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializeTest {

	public static void main(String[] args) throws IOException {
		List<Student> students = List.of(
				new Student(1,"Madhu", 21, 505, 780),
				new Student(2,"Pavan", 20, 508, 980),
				new Student(3,"Ram", 24, 501, 700),
				new Student(4,"Rajesh", 25, 531, 900)
				);
		
		List<Employee> employees = List.of(
				new Employee(10,"emp1",24, 6000,"Finance", "Hyderabad"),
				new Employee(12,"emp2",21, 9000,"Accounts", "Banglore"),
				new Employee(13,"emp3",28, 6500,"Finance", "Delhi"),
				new Employee(15,"emp4",34, 4000,"Marketing", "Mumbai")
				);
		
		List<PartTimeEmployee> partEmployees = List.of(
				new PartTimeEmployee(20,"pe1", 55, 0,"accounts","warangal",1000, 12),
				new PartTimeEmployee(22,"pe2", 43, 0,"finance","hanmakonda",2500, 14),
				new PartTimeEmployee(23,"pe3", 25, 0,"marketing","mahabad",4000, 16),
				new PartTimeEmployee(24,"pe4", 33, 0,"finance","karimnagar",3000, 19)
				);
		
		FileOutputStream fos = new FileOutputStream("./myobjects.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(students);
		oos.writeObject(employees);
		//oos.writeObject(partEmployees);		
	
		System.out.println("Serialization Done ");
		
		}
}
