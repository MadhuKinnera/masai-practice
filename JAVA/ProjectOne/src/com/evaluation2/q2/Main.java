package com.evaluation2.q2;

import java.util.Scanner;
public class Main {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc= new Scanner(System.in);
        
		System.out.println("Enter The Number of Students : ");
		int N= sc.nextInt();
		for(int i=0;i<N;i++) {
		
			System.out.println("Enter the "+(i+1)+"th Student Details ");
		    System.out.println("===================================");
		    
			System.out.println("Enter The Student  Roll No : ");
			int rollNo = sc.nextInt();
			
			System.out.println("Enter The Student Name : ");
			String name = sc.next();
			
			System.out.println("Enter The Student Marks : ");
			int marks = sc.nextInt();
			Student s= new Student(rollNo,name,marks);
			
			System.out.println((i+1)+"th Student Details");
			System.out.println("Student Roll No: "+s.getRollNumber());
			System.out.println("Student Name:  "+s.getStudentName());
			System.out.println("Student Marks: "+s.getMarks());
		}
	}

}
