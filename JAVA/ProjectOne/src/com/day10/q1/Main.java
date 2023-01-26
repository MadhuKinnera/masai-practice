package com.day10.q1;

public class Main {
	
	
	public static Person generatePerson(Person person) {
//		int count=0;
//		if(count==0) {
//			count++;
//			return new Student();
//		}
//		else {
//			return new Instructor();
//			
//		}
		return person;
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person newStudent = generatePerson(new Student(505,"JAVA",300000,"Madhu","Male"));
		Person newInstructor = generatePerson(new Instructor(1000,80000,"Ratan","Male"));
		
		newStudent.add=new Address("hnk","telangana","506134");
		newInstructor.add= new Address("apm","telangana","506015");
		
	//Student st=(Student)newStudent;
	//Instructor in=(Instructor)newInstructor;
				
		System.out.println(newStudent);
		System.out.println(newInstructor);
		//System.out.println(st);
		//System.out.println(in);
				

	}

}
