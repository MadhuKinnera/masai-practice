package com.eval3.q4;

public class ThreadA implements Runnable{
	//Kohli
	
	Thread t;
	ThreadA(){
		
	}
	ThreadA(Thread t){
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
		System.out.println("Kohli thread is printing");
		
		for(int i=0;i<=10;i++) {
			System.out.print(i+" ");
		}
		
		System.out.println("\n===========================");
		
	}

}
