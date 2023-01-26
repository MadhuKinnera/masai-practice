package com.usecase;

import java.util.Scanner;

import com.doa.EmployeeDoa;
import com.doa.EmployeeDoaImpl;
import com.exception.DepartmentException;
import com.model.Department;

public class Demo5 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			EmployeeDoa ed = new EmployeeDoaImpl() ;
			
			System.out.println("get Department Details By EmployeeId ");
			System.out.println("======================================");
			
			System.out.println("Enter Employee Id ");
			int empId = sc.nextInt();
			
			try {
				Department dept = ed.getDepartmentDetailsByEmployeeId(empId);
				
				if(dept!=null) {
					System.out.println(dept);
				}
			} catch (DepartmentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
	}

}
