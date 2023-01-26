package com.day12.q1;

public interface X {

	
	void funAbs1();
	
	default void  funDef1() {
		System.out.println("This is funDef1 in interface X");
	}
	
	static void funStatic1() {
		System.out.println("This is funStatic1 in interface X");
	}
	
	
	

}
