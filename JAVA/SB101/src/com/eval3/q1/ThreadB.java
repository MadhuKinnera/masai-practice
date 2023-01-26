package com.eval3.q1;

public class ThreadB implements Runnable {
	
	A a;
	B b;
	
	ThreadB(A a , B b){
		this.a=a;
		this.b=b;
	}
	
	
	@Override
	public synchronized void run() {
	b.funA(a);
	}
	

	

}
