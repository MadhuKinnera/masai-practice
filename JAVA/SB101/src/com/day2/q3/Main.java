package com.day2.q3;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		
		Map<String , String> lhm = new LinkedHashMap<>();
		
		lhm.put("Telangana", "Hyderabad");
		lhm.put("TamilNadu", "Chennai");
		lhm.put("Karnataka", "Bangolore");
		lhm.put("Andhrapradhesh","Amravathi" );
		lhm.put("Kerala", "Thiruvananthapuram");
		
		Set<Map.Entry<String, String>> set = lhm.entrySet();
		
		System.out.println("State          -->        Capital ");
		System.out.println("-----------------------------------");
		
		for(Map.Entry<String , String> me : set) {
			System.out.println(me.getKey()+"        -->      "+me.getValue());
			
		}
		
		

	}

}
