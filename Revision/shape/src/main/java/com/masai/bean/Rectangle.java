package com.masai.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Rectangle implements Shape{
	
	int length=10;
	int breadth=20;

	@Override
	public int calculateArea() {
		return length*breadth;
	}

	@Override
	public int calculatePerimeter() {
		return 2*(length+breadth);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Rectangle");
		
	}

}
