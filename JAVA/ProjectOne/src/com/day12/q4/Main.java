package com.day12.q4;

public class Main {

	public static void main(String[] args) {
		Test t1= new Test();
		int[] arr=t1.display(17);
		System.out.println("The Prime Numbers are : ");
		for(int i:arr) {
			if(i!=0) {
				System.out.print(i+" ");
			}
			
		}
		

	}

}
