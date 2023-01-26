package com.day12.q1;

public interface Y {
	
	void funAbs2();
	
	default void funDef2() {
		System.out.println("This is funDef2 in interface Y");
	}
	
	static void funStatic2() {
		System.out.println("This is funStatic2 in interface Y");
	}

}
