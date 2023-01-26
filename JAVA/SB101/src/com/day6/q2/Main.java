package com.day6.q2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

	public static void main(String[] args) {
	
		List<Student> students = new ArrayList<>();
		students.add(new Student(1,"madhu",830));
		students.add(new Student(2,"sathish",430));
		students.add(new Student(3,"ramu",670));
		students.add(new Student(4,"roman",320));
		students.add(new Student(5,"lesnar",480));
		
		//predicate is a interface used to test a condition
		Predicate<Student> p = s -> s.getMarks()>500;//it will return boolean value
		System.out.println("Using Predicator");
		for(Student s:students) {
			if(p.test(s)) {//calling test using Predicator object for every student object
				System.out.println(s);//printing the students who satifies the condition
			}
		}
		System.out.println("=================");
		System.out.println("usign Supplier");
		//supplier is an Interface contains get abstract method
		Supplier<String> s = () -> "Hello World ";//it will take zero arguments but return a object.
		System.out.println(s.get());//printing the return object from get method
		
		System.out.println("=================");
		System.out.println("Using Consumer");
		
		Consumer<Student> c = con -> System.out.println(con.getName());
		
		for(Student st: students ) {
			c.accept(st);
		}
		System.out.println("=================");
		
		System.out.println("Using Function");
		
         Function<Student, Integer> fn = par -> par.getMarks();//Function<Argument Type,Return Type> 
         //this will take student and return marks ...
         
         for(Student fs:students) {
        	 System.out.println(fn.apply(fs));
         }
		
		
		
		
		

	}

}
