package com.day10.q4;

public class Q {
	

	int q;
	
	boolean isAvailable=false;
	
	synchronized void get() {
		if(!isAvailable) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Getting "+q);
		isAvailable=false;
		notify();
		
	}
	
	
	synchronized void put(int x) {
		
		if(isAvailable) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.q=x;
		System.out.println("Putting "+q);
		isAvailable=true;
		notify();
		
	}
	
	
	
}
