package com.day5.q3;

public class Main {

	public static void main(String[] args) {
		 
		X x1 = Integer::parseInt;
		int res = x1.convetStringToNumber("101");
		System.out.println(res);

	}

}
