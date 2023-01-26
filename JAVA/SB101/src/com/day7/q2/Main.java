package com.day7.q2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Student> students = new ArrayList<>();
		
		students.add(new Student(10,"Madhu",430));
		students.add(new Student(12,"Pavan",400));
		students.add(new Student(13,"Ramu",620));
		students.add(new Student(16,"Raghu",410));
		students.add(new Student(10,"Sathis",490));
		
		Student s = students.stream().max((s1,s2)-> s1.getMarks() - s2.getMarks()).get();
		
		System.out.println(s);
		

	}

}
