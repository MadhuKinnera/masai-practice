package com.eval4.q3;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
	
	TreeSet<Student> students = new TreeSet<>();
	
	students.add(new Student(2, "ramu", 54, 93, 78));
	students.add(new Student(1, "aavan", 98, 39, 88));
	students.add(new Student(3, "madhu", 64, 73, 78));
	students.add(new Student(0, "madhu", 64, 73, 78));
	

	
	for(Student s:students) {
		System.out.println(s);
	}

	}

}
