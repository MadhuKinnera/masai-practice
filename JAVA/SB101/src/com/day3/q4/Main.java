package com.day3.q4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
		Map<String, List<String>>  hm = new TreeMap<>(new StringDesComp());
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0;i<3;i++) {
			System.out.println("Enter a state : ");
			String state= sc.next();
			System.out.println("Enter 4 cities ");
			List<String> cities = new ArrayList<>();
			for(int j=0;j<4;j++) {
			   
				String city= sc.next();
				cities.add(city);
			}
			
			hm.put(state, cities);
		}
		
		Set<Map.Entry<String, List<String>>> set = hm.entrySet();
		
		
		for(Map.Entry<String, List<String>> s :set) {
		  
			System.out.print(s.getKey()+" : ");
			
			List<String> arr = s.getValue();
	
			for(String city :arr) {
				System.out.print(city+" ");
			}
			System.out.println();
		
		}
		
		
		

	}

}
