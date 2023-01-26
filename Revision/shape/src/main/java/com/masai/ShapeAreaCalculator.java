package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.masai.bean.Shape;

@Component
public class ShapeAreaCalculator {
	
	private Shape shape;

	@Autowired
	public ShapeAreaCalculator(Shape shape) {
		super();
		this.shape = shape;
	}



	public void invokeCalMethods() {
		System.out.println(shape.calculateArea());
		System.out.println(shape.calculatePerimeter());
		
	}
	
	

}
