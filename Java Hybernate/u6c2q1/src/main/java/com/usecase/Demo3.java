package com.usecase;

import java.util.Scanner;

import com.doa.EmployeeDoa;
import com.doa.EmployeeDoaImpl;
import com.exception.DepartmentException;
import com.exception.EmployeeException;

public class Demo3 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
			
			EmployeeDoa ed = new EmployeeDoaImpl() ;
			
			System.out.println("Add  Employee to Department ");
			System.out.println("================");
			
			System.out.println("Enter Empid ");
			int empId = sc.nextInt();
			
			System.out.println("Enter Dept Id ");
			int deptId = sc.nextInt();
			
			try {
				ed.registerEmployeeTODepartment(empId, deptId);
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (DepartmentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println("Employee Added To Department ");
			

	}

}
