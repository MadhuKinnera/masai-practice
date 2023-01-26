package com.day10.q1;

public class A extends Thread{

  int product =1;

	@Override
	public void run() {
		
	
		
		synchronized(this) {

			System.out.println("Started the excution in sync block ");
			
			for(int i=1;i<=10;i++) {
				product=product*i;
			}
		}
		System.out.println("Notifying the thread");
		this.notify();
	}
	
	

}
