package com.day1.q2;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Queue<Product> q = new PriorityQueue<>(new ProductPriceComp());
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of Products : ");
		
		int N=sc.nextInt();
		for(int i=0;i<N;i++) {
			System.out.println("Enter the "+(i+1)+"th Product Details ");
			
			System.out.println("Enter The ProductId : ");
			int productId=sc.nextInt();
			
			System.out.println("Enter The ProductName : ");
			String productName=sc.next();
			
			System.out.println("Enter The ProductPrice ");
			int productPrice = sc.nextInt();
			
			Product p = new Product(productId,productName,productPrice);
			q.offer(p);
		}
		
		Iterator<Product> itr = q.iterator();
		
		while(itr.hasNext()) {
			 Product prod = itr.next();
			 System.out.println("product Id : "+prod.getProductId());
			 System.out.println("product Name : "+prod.getProductName());
			 System.out.println("product Price : "+prod.getProductPrice());
			 System.out.println("====================================");
		}

	}

}
