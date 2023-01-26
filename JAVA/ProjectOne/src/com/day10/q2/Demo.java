package com.day10.q2;

public class Demo {
	String name;
	int age;
	
	Demo(){
		System.out.println("This is zero argument constructor in Demo");
		
	}
	Demo(String name, int age ){
		this();
		System.out.println("this is 2 argument con in Demo");
		this.name=name;
		this.age=age;
	}

}
