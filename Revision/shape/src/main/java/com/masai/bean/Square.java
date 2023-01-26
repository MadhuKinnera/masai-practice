package com.masai.bean;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Square implements Shape{
	int side=10;

	@Override
	public int calculateArea() {
		return side*side;
	}

	@Override
	public int calculatePerimeter() {
		return 4*side;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Square ");
	}

}
