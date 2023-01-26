package com.eval1.q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mobile {
	HashMap<String,ArrayList<String>> mobiles = new HashMap<>();
	
	public String addMobile(String company,String model) {
	
		
		if(mobiles.containsKey(company)) {
	      
			ArrayList<String> arr1 = mobiles.get(company);
			arr1.add(model);
		    mobiles.put(company, arr1);
			
		}
		else {
			ArrayList<String> arr = new ArrayList<>();
			arr.add(model);
			mobiles.put(company, arr);
			
		}
		
		
		return "Added Successfully ";
		
	}
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		String s1 = m.addMobile("Apple","iphone13");
		String s2 = m.addMobile("Apple","iphone15");
		String s3 = m.addMobile("Android","note 14");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(m.mobiles);
	}
	
	

}
