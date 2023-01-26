package com.day10.q2;

public class Main extends Demo {
	String job;
	
	Main(){
		System.out.println("This is a zero argument constructor in Main");
	}
	Main(String name , int age ,String job){
		super(name,age);
		this.job=job;
	}
	
	@Override
	public String toString() {
		return "Main [ "+" name=" + name + ", age=" + age + ", job=" + job +" ]";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main m= new Main("Madhu",20,"Backend-Dev");
		System.out.println(m);

	}

}

/* output
 * ------
 * 
 * This is zero argument constructor in Demo
 * this is 2 argument con in Demo
 * Main [  name=Madhu, age=20, job=Backend-Dev ]
 * 
 * This 
 * ====
 * 
 * 1. this is used to call the own class constuctor it may with arguments or without 
 * arguments
 * 2. in the constructor where this is called it must be a first statement of constructor
 * 
 * 
 * super
 * =====
 * 1. super is a keyword which is used to called the parent constructor 
 * 2. this is also must be as a first statement in constuctor 
 * 3. this constuctor may be with arguments or without arguments
 * 
 * 
 *
 * 
 */
