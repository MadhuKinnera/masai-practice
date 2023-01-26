package com.day5.q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		String[] cities = {"hyderabad","zamravathi","delhi","bangolore"};
		
		Object[] ans = Arrays.stream(cities).sorted(Comparator.reverseOrder()).toArray();
		System.out.println(Arrays.toString(ans));
	
	}

}
