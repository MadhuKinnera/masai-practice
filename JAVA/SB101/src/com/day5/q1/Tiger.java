package com.day5.q1;

public class Tiger extends Animal{
	public Tiger() throws AnimalException {
		super();
	
	}


	public static void main(String[] args) {
		
		try {
			Animal tiger = new Tiger();
			tiger.eat();
		}catch(AnimalException ae ) {
			System.out.println(ae);
		}
		

	}


	@Override
	public void eat() {
	   System.out.println("Tiger is eating ");
		
	}

}
