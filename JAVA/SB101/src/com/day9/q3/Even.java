package com.day9.q3;

public class Even implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<20 ;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
			}
		}
		
	}

}
