package com.masai.s1d5.q2.usecase;

import java.util.Scanner;

import com.masai.s1d5.q2.bean.Employee;
import com.masai.s1d5.q2.doa.EmployeeDoa;
import com.masai.s1d5.q2.doa.EmployeeDoaImpl;

public class EmployeeUsecase {

	public static void main(String[] args) {
		
		EmployeeDoa e = new EmployeeDoaImpl();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		
		System.out.println("1. Save a Object ");
		
		System.out.println("2. Get Address ");
		
		System.out.println("3. Give Bonus ");
		
		System.out.println("4. Delete An Employee ");
		
		System.out.println("5. Break ");
		
		int c = sc.nextInt();
		
		if(c==1) {
			System.out.println("Enter Employee Details ");
			System.out.println("========================");
			
			System.out.println("Enter Empid ");
			int empid = sc.nextInt();
			
			System.out.println("Enter Employee Name ");
			String name = sc.next();
			
			System.out.println("Enter Employee Address ");
			String address = sc.next();
			
			System.out.println("Enter Salary ");
			int salary  = sc.nextInt();
			
			e.save(new Employee(empid,name,address,salary));
			
		
		}else if(c==2) {
			System.out.println("Get Address ");
			System.out.println("==============");
			
			System.out.println("Enter Emp id ");
			int empid = sc.nextInt();
			
			String address = e.getAddressOfEmp(empid);
			
			if(address!=null) {
				System.out.println("Address is "+address);
			}else {
				System.out.println("Address Not Found ");
			}
		}
		else if(c==3) {
			System.out.println("Give Bonus ");
			System.out.println("===============");
			
			System.out.println("Enter Emp id ");
			int empid = sc.nextInt();
			
			System.out.println("Enter Bonus ");
			int bonus = sc.nextInt();
			
			String res = e.giveBonusToEmp(empid, bonus);
			
			if(res!=null) {
				System.out.println(res);
			}else {
				System.out.println("Emp details not found ");
			}
			
		}else if(c==4) {
			System.out.println("Delete An Employee ");
			System.out.println("==================");
			
			System.out.println("Enter Emp id ");
			int empid = sc.nextInt();
			
			if(e.deleteEmp(empid)) {
				System.out.println("Deleted Successfully ");
			}else {
				System.out.println("Deletion Failed ");
			}
		}else if(c==5) {
			System.out.println("Thank You ");
			break;
		}else {
			System.out.println("Invalid Input ");
		}
		
		
		}
		
	

	}

}
