package com.masai.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Shape{
	
	int radius=10;

	@Override
	public int calculateArea() {
		return (int)(3.14*radius*radius);
	}

	@Override
	public int calculatePerimeter() {
		return (int)(2*3.14*radius);
	}

	@Override
	public void draw() {
		System.out.println("Drawing Circle");
		
	}

}
