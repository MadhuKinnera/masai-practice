package com.eval3.q1;

public class B {
	

	public synchronized void funA(A a) {
		System.out.println("Lock is occupied of FunA of B ");
		a.fun1();
		System.out.println("Lock is released FunA of B ");
	}
	
	public synchronized void fun1() {
		System.out.println("Inside Fun1 of B ");
	}

}
