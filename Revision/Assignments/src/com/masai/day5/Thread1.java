package com.masai.day5;

public class Thread1 extends Thread{
	
	@Override
	public void run() {
		
		System.out.println("In Thread1 thread");
		
		for(int i=100;i<200;i++) {
			System.out.println(i);
		}
	}
	

}
