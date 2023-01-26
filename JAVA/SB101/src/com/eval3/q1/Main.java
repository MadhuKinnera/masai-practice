package com.eval3.q1;

public class Main {

	public static void main(String[] args) {
		
		A a = new A();
		B b = new B();
		
		ThreadA ta = new ThreadA(a,b);
		ThreadB tb = new ThreadB(a,b);
		
		Thread t1 = new Thread(ta);
		Thread t2 = new Thread(tb);
		
		t1.start();
		t2.start();

	}

}

/*
 * Deadlock 
 * --------
 * it is a situation when two or more threads are sharing a common resource.
 * 
 * in this one thread is wait for another thread to realese the resource.
 * 
 * due to this both the threads are in waiting state
 * 
 * and this is never ending process
 * 
 * this process is called deadlock.
 * 
 * There are 4 neccessary conditions for deadlock
 * 
 * 1. Mutual Exclusion
 * 2. Non preemption
 * 3. Hold and wait
 * 4. Circular wait ..
 * 
 * in the above example one thread is waiting for another thread to realse the key.
 * 
 * so it in the state of deadlock.
 * 
 * 
 */
