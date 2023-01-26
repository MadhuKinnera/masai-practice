package com.day4.q6;

public class Child extends Parent{

	Child() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args){
		
		
	try {
		Child c = new Child();
		c.fun1();
	}
	catch(Exception e ) {
		System.out.println(e.getMessage()+" Exception ");
	}
		
		
		

	}

}
