package com.day2.q1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static <T> List<T> generate(List<T> arr){
		System.out.println(arr);
		return arr;
	}
	
	
	

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<Integer> iarr = new ArrayList<>();
		List<String> sarr= new ArrayList<>();
		
	    
		System.out.println("Enter No of ele in Int Arr ");
		int in=sc.nextInt();
		System.out.println("Enter "+in+" Numbers");
		
		for(int i=0;i<in;i++) {
			iarr.add(sc.nextInt());
		}
		
		System.out.println("Enter No of ele in String Arr ");
		int sn = sc.nextInt();
		
		System.out.println("Enter "+sn+"Strings ");
		
		for(int i=0;i<sn;i++) {
			sarr.add(sc.next());
		}
		
		generate(iarr);
		generate(sarr);
		
		
	}

}
