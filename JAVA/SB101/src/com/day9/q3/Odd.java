package com.day9.q3;

public class Odd implements Runnable {

	@Override
	public void run() {
		for(int i=1;i<20;i++) {
			if(i%2==1) {{
				System.out.print(i+" ");
			}
		}
		
	}

}
}
