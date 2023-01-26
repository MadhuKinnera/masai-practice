package com.eval3.q4;

public class ThreadB implements Runnable {
	//Dhoni
	
	

	@Override
	public void run() {
		System.out.println("Dhoni thread is printing");
		int res =0;
		
		for(int i=1;i<=20;i++) {
			res+=i;
		}
		System.out.println("Addition of first 20 nums is "+res);
		System.out.println("==============================");
		
	}

}
