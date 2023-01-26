package com.day2.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Main {
	
	
	public static void sortMapUsingValues(Map<String,Student> hm) {
		
		List<Map.Entry<String,Student>> list = new ArrayList<>(hm.entrySet());
		//System.out.println(list);
		
		 Collections.sort(list, new Comparator<Map.Entry<String, Student> >() {
	            public int compare(Map.Entry<String, Student> o1,
	                               Map.Entry<String, Student> o2)
	            {
	            	return o1.getValue().getMarks() > o2.getValue().getMarks() ? +1 : -1; 
	            }
	        });
		 
		 for(Map.Entry<String, Student> me : list) {
			 System.out.println(me.getKey());
			 System.out.println("-----------------");
			 
			 System.out.println("The Roll : "+me.getValue().getRoll());
			 System.out.println("The Name is : "+me.getValue().getName());
			 System.out.println("The Marks are : "+me.getValue().getMarks());
			 System.out.println();
		 }
		
		
		
		
	}

	public static void main(String[] args) {
		
		Map<String , Student> hm = new HashMap<>();
		hm.put("Telangana", new Student(10,"Madhu",98));
		hm.put("UP", new Student(9,"Roman",58));
		hm.put("Andhrapradhesh", new Student(5,"Raghu",32));
		hm.put("TamilNadu", new Student(3,"Ramu",78));
	
		
		sortMapUsingValues(hm);
		
		
		
		

	}

}
