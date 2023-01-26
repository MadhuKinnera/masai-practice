package com.masai;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AppRunner {
	
	private ShapeDrawer shapedrawer;
	
	private ShapeAreaCalculator shapearea;

	@Autowired
	public AppRunner(ShapeDrawer shapedrawer, ShapeAreaCalculator shapearea) {
		super();
		this.shapedrawer = shapedrawer;
		this.shapearea = shapearea;
	}
	
	public void invokeAllMethods() {
		shapedrawer.invokeDraw();
		shapearea.invokeCalMethods();
	}
	
	
	
	

}
