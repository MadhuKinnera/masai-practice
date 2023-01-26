package com.evaluation2.q4;

public class Laptop {

	private String color;
	private String companyName;
	private String name;
	private String purpose;
	private CPU cpu;
	private GraphicCard graphicCard;
	
    public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public CPU getCpu() {
		return cpu;
	}



	public GraphicCard getGraphicCard() {
		return graphicCard;
	}



	public void displayDetails() {
		

		System.out.println("Company Name : "+this.companyName);
		System.out.println("Laptop Color : "+this.color);
		System.out.println("Laptop Purpose : "+this.purpose);
		System.out.println("Cpu's Manufacturer : "+this.cpu.getManufacturer());
		System.out.println("Cpu's Processor : "+this.cpu.getProcessor());
		System.out.println("Cpu's ClockSpeed : "+this.cpu.getClockSpeed());
		System.out.println("Graphic card's Manufacturer : "+this.graphicCard.getManufacturer());
		System.out.println("Graphic card's Series : "+this.graphicCard.getSeries());
		System.out.println("Graphic card's Capacity : "+this.graphicCard.getCapacity());
		
		
    }

}
