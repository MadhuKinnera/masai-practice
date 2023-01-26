package com.day10.q3;

public class ThreadA implements Runnable{
	  Demo d;
	    
	    ThreadA(Demo d){
	    	this.d=d;
	    }
	@Override
	public void run() {
		
		System.out.println("T1 is increasing value by 1");

		int x = d.num;
		x++;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		d.num=x;
		
		
	}

}
