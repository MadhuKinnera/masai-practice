package com.day10.q4;

public class Parent {
	
	final int number;
	Parent(int x){
		number=x;
	}
	
	void method1() {
		System.out.println("method1 inside Parent"+number);
	}
	void method2() {
		System.out.println("method2 inside Parent");
	}
	void method3() {
		System.out.println("method3 inside Parent");
		
	}

}
