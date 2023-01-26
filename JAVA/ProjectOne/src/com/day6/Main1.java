package com.day6;


class Car{
	String model;
	String companyName;
	String color;
	Engine engine= new Engine();
	
	Car(){
		
	}
	
	Car(String model,String companyName,String color,
			int rmp,int power,String manufacturer){
		this.model=model;
		this.companyName=companyName;
		this.color=color;
		this.engine.rmp=rmp;
		this.engine.power=power;
		this.engine.manufacturer=manufacturer;
		
	}
	
	
	public void setHasTurbo(boolean hasTurbo) {
		engine.hasTurbo=true;
	}
	
	
	public void printCarDetails() {
		System.out.println("Car Model : "+this.model);
		System.out.println("Car CompanyName : "+this.companyName);
		System.out.println("Car Color : "+this.color);
		System.out.println("Car RMP : "+this.engine.rmp);
		System.out.println("Car Power : "+this.engine.power);
		System.out.println("Car Manufacturer : "+this.engine.manufacturer);
		System.out.println("Car Has Turbo : "+this.engine.hasTurbo);
		
	}
}

class Engine{
	int rmp;
	int power;
	String manufacturer;
	boolean hasTurbo;
	
}


public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c1= new Car();
		Car c2= new Car("H-Gear","Bajaj","Light-Pink",700,1000,"Platina");
		c2.setHasTurbo(true);
		
		c2.printCarDetails();
		c1.printCarDetails();
		
		

	}

}
