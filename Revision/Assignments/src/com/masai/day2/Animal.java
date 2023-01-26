package com.masai.day2;

public abstract class Animal {
	
	private String name;
	public Animal() {
		// TODO Auto-generated constructor stub
	}
	public Animal(String name) {
		super();
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void makeNoise();
	
	public void sleep() {
		System.out.println("Animal is sleeping ");
	}
	
	public abstract void eat();
	

}
