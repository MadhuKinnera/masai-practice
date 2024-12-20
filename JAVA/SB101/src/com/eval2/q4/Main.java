package com.eval2.q4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("madhuu");
		names.add("pavan");
		names.add("ramu");
		names.add("raghu");
		names.add("sathish");
		
		names.add("ramesh");
		names.add("nagesh");
		names.add("rahul");
		names.add("prasad");
		names.add("rambabu");
		
		List<String> newNames = names.stream().filter(s-> s.length()%2==0)
		.map(s->s.toUpperCase()).collect(Collectors.toList());
		
		Collections.sort(newNames,(s1,s2)-> s2.compareTo(s1));
		
		Consumer<List<String>> con = s -> s.forEach(str->System.out.println(str));
		System.out.println("Old Names ");
		System.out.println("===============");
		con.accept(names);
		
		System.out.println();
		System.out.println("Transformed Names ");
		System.out.println("===============");
		con.accept(newNames);
	
		
   
	}

}
