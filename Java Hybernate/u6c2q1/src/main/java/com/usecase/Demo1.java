package com.usecase;

import java.util.Scanner;

import com.doa.EmployeeDoa;
import com.doa.EmployeeDoaImpl;
import com.model.Department;

public class Demo1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		EmployeeDoa ed = new EmployeeDoaImpl() ;
		
		System.out.println("Add  Department");
		System.out.println("================");
		
		System.out.println("Enter Dept Name ");
		String deptName = sc.next();
		
		System.out.println("Enter Dept Location");
		String location = sc.next();
		
		ed.addDepartment(new Department(deptName,location));
		
		System.out.println("Dept added ");
		
		

	}

}
