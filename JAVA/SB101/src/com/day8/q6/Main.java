package com.day8.q6;

public class Main implements Runnable{

	public static void main(String[] args) {
		
		Main m1 = new Main();
		
		Thread t1 = new Thread(m1);
	
		
		System.out.println("Curr thread "+Thread.currentThread().getPriority());
		System.out.println(" t1 "+t1.getPriority());
		
		
		
		for(int i=30;i<40;i++) {
			System.out.println("inside main of Main "+i);
		}
	

	}

	@Override
	public void run() {
		for(int i=10;i<20;i++) {
			System.out.println("inside run of Main "+i);
		}
		
	}

}
