package com.masai.q1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
    String city1;
	String city2;
	String city3;
	String city4;
	String city5;
	
	
   @Value("${city1}")
	public void setCity1(String city1) {
		this.city1 = city1;
	}

   @Value("${city1}")
	public void setCity2(String city2) {
		this.city2 = city2;
	}

   @Value("${city1}")
	public void setCity3(String city3) {
		this.city3 = city3;
	}


   @Value("${city1}")
	public void setCity4(String city4) {
		this.city4 = city4;
	}

   @Value("${city1}")
	public void setCity5(String city5) {
		this.city5 = city5;
	}
   
   void print() {
	  
	   System.out.println(city1);
   }


	public static void main(String[] args) {
	
		Demo d1 = new Demo();
	
		d1.print();
		

	}

}
