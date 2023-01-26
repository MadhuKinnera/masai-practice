package com.masai.day3;

public interface DemoIntr {
	
	static int add(int x , int y) {
		return x+y;
	}
	
	default int sub(int y , int x) {
		return y-x;
	}
	

}

/*
 * Yes , we can have a non-abstract class in interface 
 * either it is static or default methods are allowed in interfaces.
 * 
 * an interface may have 
 * 1. abstract methods
 * 2. static methods
 * 3. default methods.
 * 
 * by default the methods declared in interface are public and abstract
 * 
 *  */
