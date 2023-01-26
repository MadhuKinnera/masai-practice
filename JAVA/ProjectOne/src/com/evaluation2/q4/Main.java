package com.evaluation2.q4;
import java.util.Scanner;

public class Main {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc= new Scanner(System.in);

	    Laptop l1= new Laptop();
		System.out.println("Enter The Details of Laptop");
		
		System.out.println("Company Name : ");
		String companyName=sc.next();
		System.out.println("Laptop Color : ");
		String color=sc.next();
		System.out.println("Laptop Purpose : ");
		String purpose = sc.next();
		System.out.println("Cpu's Manufacturer : ");
		String cpuManufacturer= sc.next();
		System.out.println("Cpu's Processor : ");
		String cpuProcesser=sc.next();
		System.out.println("Cpu's ClockSpeed : ");
		int cpuClockSpeed=sc.nextInt();
		System.out.println("Graphic card's Manufacturer : ");
		String graphicManufacturer=sc.next();
		System.out.println("Graphic card's Series : ");
		String graphicSeries=sc.next();
		System.out.println("Graphic card's Capacity : ");
		String graphicCapacity=sc.next();
	
	
		l1.setCompanyName(companyName);
		l1.setColor(color);
		l1.setPurpose(purpose);
		l1.getCpu().setManufacturer(cpuManufacturer);
		l1.getCpu().setClockSpeed(cpuClockSpeed);
		l1.getCpu().setProcessor(cpuProcesser);
		l1.getGraphicCard().setCapacity(graphicCapacity);
		l1.getGraphicCard().setManufacturer(graphicManufacturer);
		l1.getGraphicCard().setSeries(graphicSeries);
	
		
		
		
	

	}

}
