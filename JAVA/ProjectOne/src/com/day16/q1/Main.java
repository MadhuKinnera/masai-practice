
package com.day16.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static void printProducts(List<Product> li) {
		for(Product p : li) {
		
		System.out.println("Product Id : "+p.getProductId());
		System.out.println("Product Name : "+p.getProductName());
		System.out.println("Product Price "+p.getProductPrice());
	}
	
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter 4 Product Details : ");
		List<Product> products= new ArrayList<>(4);
		
		for(int i=0;i<4;i++) {
			System.out.println("Enter the Details of Product"+(i+1));
			
			System.out.println("Enter the Product Id : ");
			int id = sc.nextInt();
			
			System.out.println("Enter the Product Name : ");
			String name = sc.next();
			
			System.out.println("Enter the Product Price :  ");
			double price = sc.nextDouble();
			
			Product p= new Product(id,name,price);
			products.add(p);
		}
		while(true) {
		
		System.out.println("Enter the Choice : ");
		System.out.println("1. Sort By Price ");
		System.out.println("2. Sort By Name ");
		System.out.println("3. Sort By Id ");
		System.out.println("Enter Any other Key to exit ");
		int choice=sc.nextInt();
		if(choice==1) {
		     Collections.sort(products, new ProductCompPrice());
		     printProducts(products);
		}
		else if(choice==2) {
			Collections.sort(products,new ProductCompName());
			printProducts(products);
			
		}
		else if (choice==3) {
			Collections.sort(products, new ProductCompId());
			printProducts(products);
			
		}
		else {
			System.out.println("Default List of Products ");
			printProducts(products);
			break;
			
		}
	}
	
	}

}
