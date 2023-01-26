package com.eval3.q1;

public class ThreadA implements Runnable {
	
	A a;
	B b;
	
	ThreadA(A a , B b){
		this.a=a;
		this.b=b;
	}

	@Override
	public  synchronized void run() {
	 a.funA(b);
	}

}
