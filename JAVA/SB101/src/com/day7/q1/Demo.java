package com.day7.q1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo {

	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		
		products.add(new Product(1,"soap",3,15));
		products.add(new Product(2,"chocalate",16,10));
		products.add(new Product(3,"biscuit",5,20));
		products.add(new Product(4,"chips",12,30));
		products.add(new Product(5,"shampoo",18,5));
		
	    List<Product> newList = products.stream().filter(s->s.getQuantity()>10)
	    		.sorted((p1,p2)-> p1.getPrice() - p2.getPrice()).collect(Collectors.toList());
	    System.out.println("\noriginal List ");
	    System.out.println("================");
	    products.stream().forEach(p->System.out.println(p));
	    
	    
	    System.out.println("\nfilter and sorted list");
	    System.out.println("==================");
	    newList.stream().forEach(p ->System.out.println(p));

	}

}
