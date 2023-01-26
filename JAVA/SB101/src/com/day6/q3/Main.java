package com.day6.q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Main {
	
	public Map<String, Student> sortMapUsingStudentName(Map<String, Student>
	originalMap){
		
	
		List<Map.Entry<String,Student>> list = new ArrayList<>(originalMap.entrySet());
		
		
		
		Collections.sort(list,(o1,  o2)-> o2.getValue().getName().compareTo(o1.getValue().getName()));
		
		
		
		//converting array into map
		Map<String,Student > newMap = new LinkedHashMap<>();
		for(int i=0;i<list.size();i++) {
			newMap.put(list.get(i).getKey(), list.get(i).getValue());
		}
		return newMap;
	}
	
	


	public static void main(String[] args) {
		
		Map<String , Student > hm = new HashMap<>();
		hm.put("india", new Student(10,"madhu","kinneramadhu123@gmail.com",435));
		hm.put("pakisthan", new Student(12,"zakir","raghu@gmail.com",490));
		hm.put("afganisthan",new Student(14,"aman","ramu@gmail.com",300));
		hm.put("thailand",new Student(15,"rajesh","raj@gmail.com",350));
		hm.put("africa",new Student(20,"pavan","pavan@gmail.com",370));
		
        
		
		
		Main m1 = new Main();
		Map<String,Student> newMap = m1.sortMapUsingStudentName(hm);
		
		PrintMap pm = n -> {
			
			for(Map.Entry<String, Student> s : n.entrySet()) {
				System.out.println(s.getKey());
				System.out.println("===========");
				System.out.println("Student Roll : "+s.getValue().getRoll());
				System.out.println("Student Name : "+s.getValue().getName());
				System.out.println("Student Email : "+s.getValue().getEmail());
				System.out.println("Student Marks : "+s.getValue().getMarks());
				System.out.println();
			}
		};
		
		pm.printMap(newMap);
		
		
		
		
		

	}

}
