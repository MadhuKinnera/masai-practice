package com.masai;

import java.util.Scanner;

public class AppRunner {
	
	static EmployeeService es = new EmployeeServiceImpl();
	
	public static void main(String[] args) throws EmployeeException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome");
		while(true) {
		
		System.out.println("1. Add Employee ");
		System.out.println("2. Delete Employee ");
		System.out.println("3. Get All Employees ");
		System.out.println("4. Get Employee By Id ");
		System.out.println("5. Exit");
		
		int c = sc.nextInt();
		
		if(c==1) {
			System.out.println("Add Employee");
			System.out.println("==============");
			System.out.println("Enter  ID ");
			Integer employeeId = sc.nextInt();
			
			System.out.println("Enter Name");
			String name = sc.next();
			
			System.out.println("Enter Salary ");
			Integer salary = sc.nextInt();
			Employee emp = es.addEmployee(new Employee(employeeId, name, salary));
			
			System.out.println(emp+"added done ");
			
		}else if(c==2) {
			System.out.println("Enter Id ");
			Integer id = sc.nextInt();
			if(es.deleteEmployee(id))
			System.out.println("deleted done");
		}else if(c==3) {
			es.getAllEmployees().stream().forEach(s->{
				System.out.println("Id :"+s.getEmployeeId());
				System.out.println("Name :"+s.getName());
				System.out.println("Salary :"+s.getSalary());
				System.out.println("--------------------");
			});
			System.out.println("employees printed done");
			
		}else if(c==4) {
			System.out.println("Enter Emp Id ");
			Integer id = sc.nextInt();
			Employee emp = es.get(id);
			
			System.out.println(emp);
			
		}else {
			System.out.println("bye");
			break;
		}
		
		
		
		}
	}

}
