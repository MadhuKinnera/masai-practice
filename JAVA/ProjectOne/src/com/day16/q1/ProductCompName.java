package com.day16.q1;

import java.util.Comparator;

public class ProductCompName implements Comparator<Product>{

	@Override
	public int compare(Product p1, Product p2) {
		
		return (p1.getProductName().compareTo(p2.getProductName()));
		
	}
	

}
