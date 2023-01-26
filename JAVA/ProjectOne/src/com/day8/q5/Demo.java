package com.day8.q5;

import java.util.Scanner;

public class Demo {
	
	public static void printDetails(Student[] s) {
		int total=0;
		for(Student s1:s) {
			System.out.println("Roll is : "+s1.getRoll());
			System.out.println("Name is : "+s1.getName());
			System.out.println("Address is : " +s1.getAddress());
			int marks=s1.getMarks();
			total+=marks;
			System.out.println("Marks is : "+marks);	
		}
		
		System.out.println("Average Marks of all students is : "+(total*1.0/s.length));
		
	}
	
	
	

	public static void main(String[] args) {
		
		
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter No of Students : ");
	   int N=sc.nextInt();
	   
	   Student[] s= new Student[N];
	   
	   for(int i=0;i<N;i++) {
		   System.out.println("Enter Details of Student"+(i+1));
		   System.out.println("Enter Roll : ");
		   int roll=sc.nextInt();
		   System.out.println("Enter Name : ");
		   String name =sc.next();
		   System.out.println("Enter Address : ");
		   String address=sc.next();
		   System.out.println("Enter Marks : ");
		   int marks=sc.nextInt();
		   s[i]=new Student(roll,name,address,marks);
	
	   }
	   printDetails(s);
	   
	   
	   
	   
	   

	}

}
