package com.usecase;
import com.model.*;
import java.util.Scanner;
import com.doa.*;
import com.exception.*;

public class EmployeeUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		EmployeeDoa ed = new EmployeeDoaImpl();
		
		while(true) {
			
			System.out.println("1. Register Employee ");
			System.out.println("2. Get Employee By Id ");
			System.out.println("3. Delete Employee By Id ");
			System.out.println("4. Update Employee ");
			System.out.println("5. Exit ");
		
			int c = sc.nextInt();
			
			
			if(c==1) {
				
				System.out.println(" Register Employee ");
				System.out.println("====================");
				
				System.out.println("Enter Name ");
				String name = sc.next();
				
				System.out.println("Enter Address ");
				String address = sc.next();
				
				System.out.println("Enter Salary ");
				int salary = sc.nextInt();
				
				try {
				Employee emp =	ed.registerEmployee(new Employee(name,address,salary));
				
				System.out.println(emp+" is registered");
				
				} catch (EmployeeException e) {
					e.printStackTrace();
				}
				
			}else if(c==2) {
				
				System.out.println(" Get Employee ");
				System.out.println("====================");
				
				System.out.println("Enter emp id  ");
				int id = sc.nextInt();
				
				try {
					Employee emp = ed.getEmployeeById(id);
					
					System.out.println(emp+" is found ");
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(c==3) {
				System.out.println(" Delete Employee ");
				System.out.println("====================");
				
				System.out.println("Enter emp id  ");
				int id = sc.nextInt();
				
				try {
					Employee emp = ed.deleteEmployeeById(id);
					
					System.out.println(emp+" is deleted ");
					
					
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}else if(c==4) {
				System.out.println(" Update Employee ");
				System.out.println("====================");
				
				System.out.println("1. Update salary ");
				System.out.println("2. Update name ");
				System.out.println("3. Update address ");
				
				int ch = sc.nextInt();
				
				System.out.println("Enter Empid ");
				int empid = sc.nextInt();
				
				Employee emp = null;
				try {
					emp = ed.getEmployeeById(empid);
				} catch (EmployeeException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				if(ch==1) {
					
					System.out.println("Enter salary ");
					int sal = sc.nextInt();
					
					emp.setSalary(sal);
					
					try {
						Employee employee = ed.updateEmployee(emp);
						System.out.println(employee +" is updated ");
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				     
				}else if(ch==2) {
					System.out.println("Enter Name ");
				    String name = sc.next();
				    
				    emp.setName(name);
				    
					try {
						Employee employee = ed.updateEmployee(emp);
						System.out.println(employee +" is updated ");
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				  
				}else if(ch==3) {
					
					System.out.println("Enter address ");
				    String address = sc.next();
				    
				    emp.setAddress(address);
				    
					try {
						Employee employee = ed.updateEmployee(emp);
						System.out.println(employee +" is updated ");
					} catch (EmployeeException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
				else {
					System.out.println("Invalid Input ");
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
