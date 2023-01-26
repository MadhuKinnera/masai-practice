package com.masai.day5;

public class Thread2 implements Runnable {

	@Override
	public void run() {
		
		System.out.println("In Thread2 thread");
		
		for(int i=1;i<100;i++) {
			System.out.println(i);
		}
	}

}
