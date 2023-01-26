package com.masai;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	
	private Map<Student, Course> theMap; // inject 3 entries with valid details
	private List<Student> theList; //inject List of 5 Student object
	private String appName; //inject the AppName from the properties file
	//Hint: Make use of @Bean annotation to inject theMap and theList;
	public void printMap(){
	//print all the student's and their course details from theMap
		
		System.out.println("In Print Map Method ");
		System.out.println("======================");
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Student s1 = ctx.getBean("student1",Student.class);
		Student s2 = ctx.getBean("student2",Student.class);
		Student s3 = ctx.getBean("student3",Student.class);
		
		Course c1 = ctx.getBean("course1",Course.class);
		Course c2 = ctx.getBean("course2",Course.class);
		Course c3 = ctx.getBean("course3",Course.class);
		
		theMap = new HashMap<>();
		
		theMap.put(s1, c1);
		theMap.put(s2, c2);
		theMap.put(s3, c3);
		
		Set<Map.Entry<Student,Course>> set = theMap.entrySet();
		
		for(Map.Entry<Student,Course> entry : set) {
			System.out.println(entry.getKey()+"============"+entry.getValue());
		}
		
		
		
	}
	public void printList(){
	//sort the List of Student according to the marks (make use of Lamda
	//expression).
	//print all the sorted Student Details
		
ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");


System.out.println("In Print Students Method ");
System.out.println("======================");


		Student s1 = ctx.getBean("student1",Student.class);
		Student s2 = ctx.getBean("student2",Student.class);
		Student s3 = ctx.getBean("student3",Student.class);
		Student s4 = ctx.getBean("student4",Student.class);
		Student s5 = ctx.getBean("student5",Student.class);
		
		List<Student> students = new ArrayList<>();
		
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);
		
	   Collections.sort(students,(st1,st2)-> st1.getMarks()>st2.getMarks()?+1:-1);
	   
	   for(Student s: students) {
		   System.out.println(s);
	   }
		
		
		
	}
	public void printAppName(){
	//print the injected appName
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		StudentService ssObj = ctx.getBean("ss",StudentService.class);
		
		
		System.out.println("In Print App Name Method ");
		System.out.println("======================");
		
		System.out.println("The App Name is "+ssObj.appName);
		
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	

}
