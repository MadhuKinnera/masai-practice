package com.day9.q2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal[] arr= new Animal[3];
		
	    arr[0]= new Dog();
	    arr[1]= new Cat();
	    arr[2]= new Tiger();
	    
	    for(int i=0;i<arr.length;i++) {
	    	arr[i].eat();
	    	arr[i].makeNoise();
	    	arr[i].walk();
	    }
		

	}

}
