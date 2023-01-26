package com.day11.q4;
import java.util.Scanner;

public class Student {
	
	private int roll;
	private String name;
	private int marks;
	private char grade;
	
	
	
	
	
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", marks=" + marks + ", grade=" + grade + "]";
	}
	public Student() {
		
	}
	public void displayDetails() {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Roll : ");
		int roll=sc.nextInt();
		
		System.out.println("Enter Name : ");
		String name =sc.next();
		
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		char grade = calculateGrade(marks);
		
		
		Student s1= new Student(roll,name,marks,grade);
		
		System.out.println(s1);
		
	}
	private char calculateGrade(int marks) {
		if(marks>=500) {
			return 'A';
		}
		else if(marks>=400) {
			return 'B';
		}
		else {
			return 'C';
		}
	}
	
	
	public Student(int roll, String name, int marks,char grade) {
		super();
		this.roll = roll;
		this.name = name;
		this.marks = marks;
		this.grade=grade;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	

}
