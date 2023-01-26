package com.masai.day4.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

import com.masai.day4.bean.Address;
import com.masai.day4.bean.Student;
import com.masai.day4.service.StudentService;
import com.masai.day4.service.StudentServiceImpl;

public class Demo {

	public static void main(String[] args) {
		StudentService ss = new StudentServiceImpl();

		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("1. Add Student");
			System.out.println("2. Remove Student By Id");
			System.out.println("3. Find Student By Id");
			System.out.println("4. Find Student By Pincode");
			System.out.println("5. Get Students Sort By Names");
			System.out.println("6. get Set Of Marks");
			System.out.println("7. Add all Students to Existing Students ");
			System.out.println("Press any other key to exit");

			System.out.println("Enter Your Choice ");
			int choice = sc.nextInt();

		

			if(choice==1) {
			
				System.out.println("Enter Student Name ");
				String name = sc.next();

				System.out.println("Enter Student Marks ");
				Integer marks = sc.nextInt();

				System.out.println("Enter Student Section ");
				String section = sc.next();

				System.out.println("Enter Student City ");
				String city = sc.next();

				System.out.println("Enter Student State ");
				String state = sc.next();

				System.out.println("Enter Student Pincode ");
				String pincode = sc.next();

				Address address = new Address(city, state, pincode);
				Student s = new Student(name, marks, section, address);
				if (null == ss.addStudent(s)) {
					System.out.println("Student DoesNot Added ");
				} else {
					System.out.println(s + " is Added ");
				}
				

			}

			else if(choice==2) {

				System.out.println("Enter Student Id ");
				Integer id = sc.nextInt();

				Student student = ss.removeStudent(id);

				if (student == null) {
					System.out.println("Student Not Found");
				} else {
					System.out.println(student + " Deleted");
				}
				
			}
			else if(choice==3) {

				System.out.println("Enter Student Id ");
				Integer id = sc.nextInt();

				Student student = ss.findStudent(id);

				if (student == null) {
					System.out.println("Student Not Found");
				} else {
					System.out.println(student + " Found ");
				}

				

			}
			else if(choice==4) {

				System.out.println("Enter Student Pincode ");
				String pincode = sc.next();

				Student student = ss.findStudentByPincode(pincode);

				if (student == null) {
					System.out.println("Student Not Found");
				} else {
					System.out.println(student + " Found ");
				}

				

			}
			else if(choice==5){

				Set<Student> students = ss.sortWithNames();
				
				if(students.isEmpty()) {
					System.out.println("No Students Exist");
				}else {
					students.stream().forEach(System.out::println);
				}
					
			

			}
			else if(choice==6) {

				Set<Integer> setOfMarks = ss.setOfMarks();
				
				if(setOfMarks.isEmpty()) {
					System.out.println("No Students Exist");
				}else {
					setOfMarks.stream().forEach(System.out::println);
				}
					
				

			}
			else if(choice==7) {

				System.out.println("Enter No Of Students you want to add");
				Integer num = sc.nextInt();
				
				List<Student> list = new ArrayList<>();
				
				while(num-->0) {

					System.out.println("Enter Student Name ");
					String name = sc.next();

					System.out.println("Enter Student Marks ");
					Integer marks = sc.nextInt();

					System.out.println("Enter Student Section ");
					String section = sc.next();

					System.out.println("Enter Student City ");
					String city = sc.next();

					System.out.println("Enter Student State ");
					String state = sc.next();

					System.out.println("Enter Student Pincode ");
					String pincode = sc.next();

					Address address = new Address(city, state, pincode);
					Student s = new Student(name, marks, section, address);
					
					list.add(s);
				}
				
				List<Student> students = ss.addAllStudents(list);

				if(students.isEmpty()) {
					System.out.println("No Students Found");
				}else {
					students.stream().forEach(System.out::println);
				}
				
				

			}
			else {
				System.out.println("Thank You ");
				break;
			}
			
			
	}
		

}
}
