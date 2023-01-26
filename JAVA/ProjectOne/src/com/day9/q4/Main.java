package com.day9.q4;

public class Main extends Demo{
	
	@Override
	void print() {
		System.out.println("Iam print() in Main and Iam overriding the Demo ");
	}
	
	void add(int a ,int b) {
		System.out.println("Addition of 2 numbers is "+(a+b));
	}
	
	void add(int a ,int b ,int c) {
		System.out.println("Addition of 3 numbers is : "+(a+b+c));
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main m= new Main();
		
		//Method Overloading 
		m.add(10, 20);
		m.add(10, 20, 30);
	
		
		//Method Overriding 
		m.print();

	}

}
/*
 * Difference between Method Overloading and Override
 * 
 * Method Overloading 
 * ==================
 * 
 * 1. Method overloading is also known as compile time polymorphism
 * or static polymorphism
 * 2. Using same method name with different arguments is known as method overloading
 * the compiler decides which method to excute while compiling only.
 * 3. This happens within the class 
 * 4. no. of arguments or type of arguments must be differ 
 * 5. there is a disadvantage in this compiler may goes into ambiguity if
 * two eligible methods are present.
 * 
 *output
 *------
 *Addition of 2 numbers is 30
 *Addition of 3 numbers is : 60
 * 
 * 
 * Method Overriden
 * ================
 * 
 * 1. Using the same method with different defination in a child class is called 
 * method overriding 
 * 2. In these inheritance involved .
 * 3. This happens between 2 or more classes 
 * 4. the priority is given to overriden method .
 * if no overring happening then the method in parent is called .
 * 5. we call parent method which is overriden using super keyword
 * 
 * output
 * ------
 * 
 * Iam print() in Main and Iam overriding the Demo 
 */
