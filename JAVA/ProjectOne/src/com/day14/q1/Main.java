package com.day14.q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> arr= new ArrayList<>();
		arr.add("Hanmakonda");
		arr.add("Warangle");
		arr.add("Hyderabad");
		arr.add("Karimnagar");
		System.out.println("Using for Loop");
		System.out.println("--------------");
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
		System.out.println("=============");
		System.out.println("Using Enhanced For loop");
		System.out.println("------------------------");
		for(String s:arr) {
			System.out.println(s);
		}
		System.out.println("=============");
		System.out.println("Usign iterator");
		System.out.println("--------------");
		Iterator<String> itr=arr.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("===============");
		
	
		

	}

}
