package com.day10.q4;

public class Consumer implements Runnable {
	Q q;
	
	Consumer(Q q){
		this.q=q;
	}

	@Override
	public void run() {
		
		
		while(true) {
			q.get();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
