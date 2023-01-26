package com.masai.day2;

public class Cat extends Animal{
	
	private String nickname;
	
	public Cat() {
		// TODO Auto-generated constructor stub
	}


	public String getNickname() {
		return nickname;
	}


	public void setNickname(String nickname) {
		this.nickname = nickname;
	}


	public Cat(String nickname) {
		this.nickname=nickname;
		// TODO Auto-generated constructor stub
	}
	
	public Cat(String nickname,String name) {
		super(name);
		this.nickname=nickname;
		// TODO Auto-generated constructor stub
	}
	
	

	
	@Override
	public void makeNoise() {
		System.out.println("mew mew");
		
	}

	@Override
	public void eat() {
		System.out.println("cat is eating");
		
	}

	public void jump() {
		System.out.println("Cat is jumping");
	}

}
