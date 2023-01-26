package com.day6;

public class Demo {
	
	Demo(){
		this("Madhu");
		System.out.println("Demo inside Demo()");
	}
	
	Demo(String s){
		this(10);
		System.out.println("Demo inside Demo(String s) "+s);
	}
	
	Demo(int x){
		this(15f);
		System.out.println("Demo inside Demo(int x) "+x);
	}
	Demo(float f){
		System.out.println("Demo inside Demo(float f) "+f);
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d1=new Demo();

	}

}
