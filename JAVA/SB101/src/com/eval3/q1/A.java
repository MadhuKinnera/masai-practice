package com.eval3.q1;

public class A {
	
	public synchronized void funA(B b) {
		System.out.println("Lock is occupied of FunA of A");
		b.fun1();
		System.out.println("Lock is released FunA of A ");
	}
	
	public synchronized void fun1() {
		System.out.println("Inside Fun1 of A ");
	}

}
