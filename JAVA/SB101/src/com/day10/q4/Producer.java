package com.day10.q4;

public class Producer implements Runnable {

	Q q;
	
	Producer(Q q){
		this.q=q;
	}
	@Override
	public void run() {
		
		int i=0;
		while(true) {
			q.put(i++);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

	
}
