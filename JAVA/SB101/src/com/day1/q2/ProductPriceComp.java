package com.day1.q2;

import java.util.Comparator;

public class ProductPriceComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		Product p1 = (Product)o1;
		Product p2 = (Product)o2;
		 
		return p1.getProductPrice() >  p2.getProductPrice() ? +1 : -1 ;
	}

}
