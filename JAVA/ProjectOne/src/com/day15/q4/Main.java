package com.day15.q4;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	List<Employee> employees = new ArrayList<>();
	
	
	
	public void printEmpDetails(List<Employee> emp) {
		
		if(emp.size()==0) {
			System.out.println("Employee List is Employee ");
			return;
		}
		
		for(int i=0;i<emp.size();i++) {
			System.out.println("Employee Id : "+emp.get(i).getEmployeeId());
			System.out.println("Employee Name : "+emp.get(i).getEmployeeName());
			System.out.println("Employee Salary : "+emp.get(i).getEmployeeSalary());
			System.out.println("Employee Dept Id : "+emp.get(i).department.getDepartmentId());
			System.out.println("Employee Dept Name : "+emp.get(i).department.getDepartmentName());
			System.out.println("============================================");
		}
	}
	

	public void removeEmpByName(String name) {
	
		
		for(int i=0;i<employees.size();i++) {
			if((employees.get(i).getEmployeeName()).equalsIgnoreCase(name)) {
				employees.remove(i);
				break;
			}
		}
	}
	
	public void findEmpByDept(String deptName) {
		
		List<Employee> empByDept= new ArrayList<>();
 		
		for(int i=0;i<employees.size();i++) {
			if((employees.get(i).department.getDepartmentName()).equalsIgnoreCase(deptName)) {
				empByDept.add(employees.get(i));
			}
		}
		printEmpDetails(empByDept);
		
		
	}
	
	
	


	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		Main m= new Main();
		
		List<Employee> employees = new ArrayList<>();
		
		System.out.println("Welcome To Employee Management System ");
		System.out.println("-------------------------------------");
		int count=1;
		while(true) {
			System.out.println("Do you want to enter the details of employee (y/n)");
			String y=sc.next();
			if(!(y.equalsIgnoreCase("y"))) {
				System.out.println("THANK YOU ");
			    break;
			}
			System.out.println("Enter the Details of employee "+(count++));
			System.out.println("-------------------------------------");
			
			System.out.println("Enter the employee Id : ");
			int empId=sc.nextInt();
			
			System.out.println("Enter the employee Name : ");
			String name=sc.next();
			
			System.out.println("Enter the employee Salary : ");
			double salary = sc.nextDouble();
			
			System.out.println("Enter the department Id : ");
			int deptId=sc.nextInt();
			
			System.out.println("Enter the department Name : ");
			String deptName= sc.next();
			
			Employee emp=new Employee(empId,name,salary,deptId,deptName);
			m.employees.add(emp);
			
			System.out.println("Employee Details added Successfully ");
			
			
		}
		
		if(m.employees.size()==0) {
			System.out.println("No Employees Found :( ");
			return;
		}
		
		
		while(true) {
			System.out.println("Enter your Choice : ");
			System.out.println("1. Find Employees in particular department ");
			System.out.println("2. Remove particular employee ");
			System.out.println("3. Print Employee in all Departments ");
			
			int choice = sc.nextInt();
			if(choice ==1) {
				System.out.println("Enter The Departmet Name : ");
				String deptName=sc.next();
				m.findEmpByDept(deptName);
			}
			else if(choice ==2) {
				System.out.println("Enter Employee Name to Remove ");
				String name =sc.next();
				m.removeEmpByName(name);
			 
				
			}
			else if(choice ==3) {
				m.printEmpDetails(m.employees);
			}
			else {
				System.out.println("Thank You Have A Great Day :)");
				break;
			}
			
			
			
		}
			
		

	}

}
