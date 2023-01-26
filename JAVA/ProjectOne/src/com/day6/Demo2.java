package com.day6;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student2 s1= Student2.getStudent(true);
		Student2 s2= Student2.getStudent(false);
		
	
		
		
		
		System.out.println(s1.getRoll());
		System.out.println(s1.getName());
		System.out.println(s1.getAddress());
		System.out.println(s1.getCollageName());
		
		System.out.println("===========");
		
		System.out.println(s2.getRoll());
		System.out.println(s2.getName());
		System.out.println(s2.getAddress());
		System.out.println(s2.getCollageName());

	}

}
