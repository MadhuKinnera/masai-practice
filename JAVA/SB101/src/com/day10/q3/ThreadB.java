package com.day10.q3;

public class ThreadB implements Runnable{
    Demo d;
    
    ThreadB(Demo d){
    	this.d=d;
    }
	@Override
	public void run() {
		
		synchronized(this) {
			System.out.println("T2 is Decreasing value by 1");
		int y=d.num;
		y--;
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.num=y;
		
		}
		
		
	}

}
