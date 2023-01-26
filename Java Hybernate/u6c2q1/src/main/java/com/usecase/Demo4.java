package com.usecase;

import java.util.List;
import java.util.Scanner;

import com.doa.EmployeeDoa;
import com.doa.EmployeeDoaImpl;
import com.exception.EmployeeException;
import com.model.Employee;

public class Demo4 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
			
			EmployeeDoa ed = new EmployeeDoaImpl() ;
			
			System.out.println("get All Employees With DeptName ");
			System.out.println("================================");
			
			System.out.println("Enter Dept Name ");
			String deptName  = sc.next();
			
			
			try {
				List<Employee> employees = ed.getAllEmployeeWithDeptName(deptName);
				
			    if(employees.size()>0) {
			    	System.out.println("Employees are ");
			    	System.out.println("---------------");
			    	employees.forEach(e->System.out.println(e));
			    }else {
			    	System.out.println("No Employees Found");
			    }
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			

	}

}
