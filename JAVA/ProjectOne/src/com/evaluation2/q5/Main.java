package com.evaluation2.q5;
import java.util.Scanner;
public class Main {
	
	public static Employee getEmployeeDetails(int id,String name,int salary,int pf) {
		Employee emp= new Employee();
		emp.setEmployeeId(id);
		emp.setEmployeeName(name);
		emp.setSalary(salary);
        emp.calculateNetSalary(pf);
		return emp;
	}
	
	public static void printDetails(Employee emp) {
		
		System.out.println("Employee ID : "+emp.getEmployeeId());
		System.out.println("Employee Name : "+emp.getEmployeeName());
		System.out.println("Employee salary : "+emp.getSalary());
		System.out.println("Employee Net salary : "+emp.getNetSalary());
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name : ");
		String name= sc.next();
		
		System.out.println("Enter Salary : ");
		int salary=sc.nextInt();
		
		System.out.println("Enter PF : ");
		int pf=sc.nextInt();
		
		
		Employee emp=getEmployeeDetails(id,name,salary,pf);
		
		printDetails(emp);
		

	}

}
