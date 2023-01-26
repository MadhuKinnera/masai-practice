package com.masai.day2;

public class Dog extends Animal {
	private  String breed;
	
	public Dog() {
		// TODO Auto-generated constructor stub
	}
	
	public Dog(String breed) {
		this.breed = breed;
	}
	
	
	

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public Dog(String breed,String name) {
		super(name);
		this.breed = breed;
	}


	@Override
	public void makeNoise() {
		System.out.println("Bow Bow ");
		
	}

	@Override
	public void eat() {
		System.out.println("Dog is Eating ");
		
	}
	
	public void play() {
		System.out.println("Dog is playing");
	}

}
