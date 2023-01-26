package com.eval3.q2;

public class Diff extends A {
	
	void add(int x,int y) {
		System.out.println("Sum of 2 numbers are : "+(x+y));
	}
	void add(int x,int y ,int z) {
		System.out.println("Sum of 3 numbers are : "+(x+y+z));
	}
	@Override
	void funDemo() {
		System.out.println("This is funDemo from Class Diff");
	}

	public static void main(String[] args) {
		
		Diff d= new Diff();
		d.add(19, 30);
		d.add(31,64,9);
		d.funDemo();
		
		

	}

}

/* Early Binding
 * -------------
 * 1. Early Binding is a type of polymorphism also known as Static or compile time
 * polymorphism
 * 
 * 2.in this Method overloading takes place
 * 
 * 3. compiler takes the decision which method to call on runtime.
 * 
 * 4. Same Method name but datatype or no of arguments may differ .
 * 
 * 5. There is a chance for compiler to go on ambiguity state.
 * 
 * Late Binding
 * -------------
 * 1.Late is binding is also a type of polymorphism also known as runtime polymrophism
 * or dynamic polymorphism
 * 
 * 2. this done by method overrideing with the help of inheritance
 * 
 * 3. if we changed the fun definatioin in child class . then the overidden method is
 * called when we call from child object ..
 * 
 * 4. This is also used in abstract classes and interfaces.
 * 
 * 5. same method name and arguments but in the another class who extends the parent .
 * 
 * 
 */
