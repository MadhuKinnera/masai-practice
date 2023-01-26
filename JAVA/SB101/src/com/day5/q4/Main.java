package com.day5.q4;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		PrintList pl = (cities)->{
			for(String city :cities ) {
				System.out.println(city);
			}
		};
		
		List<String> cities = new ArrayList<>();
		
		cities.add("mumbai");
		cities.add("goa");
		cities.add("chennai");
		cities.add("warangle");
		cities.add("delhi");
		
		pl.display(cities);
		
		

	}

}
