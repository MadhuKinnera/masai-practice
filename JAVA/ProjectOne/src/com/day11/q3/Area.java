package com.day11.q3;

public class Area extends Shape{

	@Override
	public int rectangleArea(int length,int breadth) {
		return length*breadth;
	}
	
	@Override
	public double circleArea(int radius) {
		return 3.14*radius*radius;
	}
	
	@Override
	public int squareArea(int side) {
		return side*side;
	}
}
