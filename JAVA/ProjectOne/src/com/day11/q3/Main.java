package com.day11.q3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Area a = new Area();
		double circleArea=a.circleArea(5);
		int rectangleArea=a.rectangleArea(12, 18);
		int squareArea=a.squareArea(23);
		System.out.println("The Area of Circle is : "+circleArea);
		System.out.println("The Area of Rectangle is : "+rectangleArea);
		System.out.println("The Area of Square is : "+squareArea);
	}

}
