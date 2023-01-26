package com.day16.q2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
	
	public static void printEmpDetails(TreeSet<Employee> emp) {
		for(Employee e: emp) {
			System.out.println("Employee Id : "+e.getEmpId());
			System.out.println("Employee Name : "+e.getName());
			System.out.println("Employee Salary : "+e.getSalary());
			System.out.println("===================================");
		}
	}
	
	

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
	
		TreeSet<Employee> employees = new TreeSet<>();
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter The Details of Employee "+(i+1));
			
			System.out.println("Enter employee Id : ");
			int empId=sc.nextInt();
			
			System.out.println("Enter employee Name :  ");
			String name = sc.next();
			
			System.out.println("Enter the Salary : ");
			double salary= sc.nextDouble();
			
			Employee emp= new Employee(empId,name,salary);
			employees.add(emp);
		}
		
		printEmpDetails(employees);

	}

}
