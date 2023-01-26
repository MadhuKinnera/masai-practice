package com.day7;
import java.util.Scanner;

public class Course {
	int courseID;
	String courseName;
	int courseFee;
	
	void printCourseDetails() {
		System.out.println("Course ID : "+this.courseID);
		System.out.println("Course Name : "+this.courseName);
		System.out.println("Course Fee : "+this.courseFee);
	}
	
	public static void authenticate(String username,int password) {
		if(username=="Admin" && password==1234) {
			Course c1=new Course();
			Scanner sc= new Scanner(System.in);
			System.out.println("==================");
			System.out.println("Enter Course Id : ");
			c1.courseID=sc.nextInt();
			System.out.println("Enter Course Name : ");
			c1.courseName=sc.next();
			System.out.println("Enter course Fee : ");
			c1.courseFee=sc.nextInt();
			c1.printCourseDetails();
		}
		else {
			System.out.println("Invalid Username Or Password");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		authenticate("Madhu",1234);
		authenticate("Admin",1234);
	}

}
