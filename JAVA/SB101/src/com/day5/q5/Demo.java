package com.day5.q5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();
		productList.add(new Product(1,"soap",3,10));
		productList.add(new Product(2,"sugar",2,40));
		productList.add(new Product(3,"tamato",6,20));
		productList.add(new Product(4,"biscuit",2,8));
		productList.add(new Product(5,"chocalate",3,5));
		
		
		
		Collections.sort(productList,
				(p1,p2)-> p2.getPrice()-p1.getPrice()
				
				);
		
		
		
           for(Product p : productList) {
        	   System.out.println("product Id "+p.getProductId());
        	   System.out.println("product Name "+p.getProductName());
        	   System.out.println("product Quantity "+p.getQuantity());
        	   System.out.println("product Price "+p.getPrice());
        	   System.out.println("=========================");
           }
		

	}

}
