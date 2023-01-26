package com.day9.q3;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Manager m= new Manager();
		Employee e= new Employee();
		
		System.out.println("Enter Manager Details ");
		
        System.out.println("Enter Name : ");
        String name = sc.next();
        
        System.out.println("Enter Age : ");
        int age = sc.nextInt();
        
        System.out.println("Enter Phone Number : ");
        String phone= sc.next();
        
        System.out.println("Enter Address : ");
        String address = sc.next();
        
        
        System.out.println("Enter Salary : ");
        double salary = sc.nextDouble();
        
        m.name=name;
        m.address= address;
        m.age=age;
        m.phoneNumber=phone;
        m.salary=salary;
        
        
        
        
System.out.println("Enter Employee Details ");
		
        System.out.println("Enter Name : ");
        String ename = sc.next();
        
        System.out.println("Enter Age : ");
        int eage = sc.nextInt();
        
        System.out.println("Enter Phone Number : ");
        String ephone= sc.next();
        
        System.out.println("Enter Address : ");
        String eaddress = sc.next();
        
        
        System.out.println("Enter Salary : ");
        double esalary = sc.nextDouble();
        
        e.name=ename;
        e.address= eaddress;
        e.age=eage;
        e.phoneNumber=ephone;
        e.salary=esalary;
        
        System.out.println("The Manager Details are ");
        System.out.println("Name is : "+m.name);
        System.out.println("Age is : "+m.age);
        System.out.println("Phone Number is : "+m.phoneNumber);
        System.out.println("Address is : "+m.address);
        System.out.println("Salary is : "+m.salary);
        
        System.out.println("==============================");
        
        System.out.println("The Employee Details are ");
        System.out.println("Name is : "+e.name);
        System.out.println("Age is : "+e.age);
        System.out.println("Phone Number is : "+e.phoneNumber);
        System.out.println("Address is : "+e.address);
        System.out.println("Salary is : "+e.salary);
        
        
		

	}

}
