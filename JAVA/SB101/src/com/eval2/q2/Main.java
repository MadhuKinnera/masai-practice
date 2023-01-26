package com.eval2.q2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
		
		
		Student student = new Student(10,"Madhu",480);
		
		
		Predicate<Student> p = s -> s.getMarks() < 500;
	
		System.out.println("Using Predicate");
		
		boolean res = p.test(student);
		if(res) {
			System.out.println("Student Marks are less than 500");
		}
		else {
			System.out.println("Student Marks are greater than or equal 500");
		}
		
		System.out.println("====================");
		
		
		Consumer<Student> con = s -> {	
			
			System.out.println("Student Id : "+s.getId());
			System.out.println("Student Name : "+s.getName());
			System.out.println("Student Marks : "+s.getMarks());
			System.out.println("=================");
		};
		
		System.out.println("Using Consumer ");
		
		con.accept(student);
	
		
		Supplier<Student> sup = ()->{
		    Student s = new Student(15,"Ramu",590);
		    return s;
		};
		
		System.out.println("Using Supplier ");
		System.out.println(sup.get());
		System.out.println("================");
		
		
		System.out.println("Using Function ");
		
		Function<String, Integer> fun = str -> Integer.parseInt(str);
		
		System.out.println(fun.apply("2022")+50);
		
		System.out.println("====================");
		
		
		
		

	}

}
