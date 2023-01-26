package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	Drawing shapeobj;//change the object in xml file.
	

	public Drawing getShape() {
		return shapeobj;
	}


	public void setShape(Drawing shapeobj) {
		this.shapeobj = shapeobj;
	}


	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Main m = ctx.getBean("main",Main.class);
		
	      m.shapeobj.drawing();

	}

}
