package com.day10.q4;
import java.util.Scanner;

public final class Child extends Parent {
	
	Child(int x){
		super(x);
		
	}
	

	@Override
	void method1() {
		System.out.println("method1 inside Child &"+" Number : "+ this.number);
	}
	
	void method4() {
		System.out.println("method4 inside Child");
	}
	
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);//Asking Keyboard to activate
		
		System.out.println("enter a number : ");
		int num  = sc.nextInt();//Taking Input from User
		
		if(num>0 && num<=10) {
			Parent p = new Child(num);//Dynamic polymorphism
			p.method1();
			p.method2();
			p.method3();
			Child ch=(Child)p;// Object DownCasting...
			ch.method4();
		}
		else {
			System.out.println("Invalid Number");
		}
	     
	}
	
}
