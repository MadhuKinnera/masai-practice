package com.usecase;

import java.util.Scanner;

import com.doa.EmployeeDoa;
import com.doa.EmployeeDoaImpl;
import com.model.Address;
import com.model.Employee;

public class Demo2 {

	public static void main(String[] args) {
		
          Scanner sc = new Scanner(System.in);
		
		EmployeeDoa ed = new EmployeeDoaImpl() ;
		
		System.out.println("Add  Employee");
		System.out.println("================");

		System.out.println("Enter  Name ");
		String name = sc.next();
		
		System.out.println("Enter Salary");
		int salary = sc.nextInt();
		
		System.out.println("Enter Address");
		System.out.println("Enter City ");
		String city = sc.next();
		System.out.println("Enter State ");
		String state = sc.next();
	    System.out.println("Enter Pincode");
	    int pincode = sc.nextInt();
	    
	    Address address = new Address(city,state,pincode);
	    
	    ed.addEmployee(new Employee(name,salary,address));
	    
	    System.out.println("Employee Added ");
	}

}
