package com.eval3.q4;

public class ThreadC implements Runnable {
	
	//Rohith
	Thread t;
	ThreadC(){
		
	}
	ThreadC(Thread t){
		this.t=t;
	}

	@Override
	public void run() {
		try {
			t.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Rohith thread is printing ");
		int res =1;
		for(int i=1;i<=10;i++) {
			res*=i;
		}
		System.out.println("The product of first 10 nums "+res);
		System.out.println("=======================");
		
	}

}
