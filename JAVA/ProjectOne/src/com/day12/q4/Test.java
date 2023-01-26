package com.day12.q4;

public class Test implements Intr{
	public int[] display(int p) {
		int[] arr=new int[p];
		
		for(int i=0;i<=p-2;i++) {
			int count=0;
		for(int j=2;j<=p;j++) {
			if((i+2)%j==0) {
				count++;
			}
		}
		if(count<2) {
			arr[i]=i+2;
		}
		
			
		}
		
		return arr;
	}

}
