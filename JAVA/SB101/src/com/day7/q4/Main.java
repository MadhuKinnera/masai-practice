package com.day7.q4;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
 
		Set<Student> students = new HashSet<>();
		students.add(new Student(1,"madhu",450));
		students.add(new Student(3,"pavan",700));
		students.add(new Student(6,"raghu",680));
		students.add(new Student(10,"brock",420));
		students.add(new Student(15,"dean",570));
		
		Set<Student > newSet = students.stream().filter(s->s.getMarks()<500).collect(Collectors.toSet());
		
		System.out.println("original students set");
		students.forEach(s->System.out.println(s));
		System.out.println();
		System.out.println("Student below 500 Marks ");
		newSet.stream().forEach(s->System.out.println(s));
		
		
	}

}
