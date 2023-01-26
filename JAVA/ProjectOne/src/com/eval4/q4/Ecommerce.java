package com.eval4.q4;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {

	List<Product> productList=new ArrayList<>();

	
	void addProductToList(Product product) {
		int flag=0;
		for(Product pl:productList) {
			if((pl.getName()).equals(product.getName()) && 
					pl.getPrice()==product.getPrice()) {
				flag=1;
				pl.setCount(product.getCount()+pl.getCount());
				System.out.println("Count updated successfully for already exist product ");
				break;
			}
		}
		if(flag==0) {
			productList.add(product);
			System.out.println("product added Successfully ");
		}
		
		
	}

	
	List<Product> showAllProduct(){
		return productList;
	}
}
