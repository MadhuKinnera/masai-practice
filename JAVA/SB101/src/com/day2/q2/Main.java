package com.day2.q2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {
	
		Map<Student, String> lhm= new LinkedHashMap<>();
		lhm.put(new Student(1,"madhu",78), "Telangana");
		lhm.put(new Student(2,"raghu",33), "AP");
		lhm.put(new Student(3,"ram",88), "Maharastra");
		lhm.put(new Student(4,"rakhi",18), "Telangana");
		
		//System.out.println(lhm);
		
		Map<Student,String> tm = new TreeMap<>(lhm);
		
		
		  Set<Map.Entry<Student,String>> set = tm.entrySet();
		  

		  for(Map.Entry<Student, String> s: set) {
			  System.out.println(s.getValue());
			  System.out.println("===============");
			  Student st = s.getKey();
			  System.out.println("Roll is : "+st.getRoll());
			  System.out.println("Name is : "+st.getName());
			  System.out.println("Marks is : "+st.getMarks());
			  System.out.println();
			  
		  }
	}

}
