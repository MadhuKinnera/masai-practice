package com.masai;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo {
	
	 public static void main(String[] args) {
		 System.out.println("Hello Madhu ");
		 
		// System.out.println(arr.contains(10));
		 
		 List<Integer> list = new ArrayList<>();
		 list.add(10);
		 list.add(50);
		 list.add(30);
		 list.add(20);
		 
		 List<Student> students = new ArrayList<>();
		 students.add(new Student(1,"Madhu",250));
		 students.add(new Student(5,"Rajesh",300));
		 students.add(new Student(3,"Ram",900));
		 students.add(new Student(4,"Raghu",700));
		 
		 
	students.stream()
	.sorted(Comparator.comparingInt(Student::getMarks))
	.forEach(System.out::println);

		
		


	}

}
