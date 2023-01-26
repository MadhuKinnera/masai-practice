package com.day7.q3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> nums =Arrays.asList(3,6,5,9);
		List<Integer> squares = nums.stream().map(n-> n*n).collect(Collectors.toList());
		
		System.out.println("Numbers ");
		System.out.println("==============");
		nums.stream().forEach(n->System.out.println(n));
		System.out.println();
		System.out.println("Square Numbers");
		System.out.println("===========");
		squares.stream().forEach(s->System.out.println(s));
 
	}

}
