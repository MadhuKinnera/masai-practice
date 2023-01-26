package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.masai.bean.Shape;

@Component
public class ShapeDrawer {
	
	private Shape shape;
	
	@Autowired
	public ShapeDrawer(Shape shape) {
		super();
		this.shape = shape;
	}



	public void invokeDraw() {
		shape.draw();
	}

}
