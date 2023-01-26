package com.masai.usecase;


import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.masai.AppConfig;
import com.masai.presentation.Presentation;

public class Demo {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		Presentation pr = ctx.getBean("presentation",Presentation.class);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. Insert Product ");
			System.out.println("2. Get All Products ");
			System.out.println("3. Search Product By Id ");
			System.out.println("4. Get Products within Range ");
			System.out.println("5. Exit ");
			
			int c = sc.nextInt();
			
			if(c==1) {
				pr.insertProduct();
			}else if(c==2) {
				pr.printAllProduct();
			}else if(c==3) {
				pr.searchProduct();
			}else if(c==4) {
				pr.GetProductsWithingPriceRange();
			}else if(c==5){
				System.out.println("Thank You For Using ");
				break;
			}else {
				System.out.println("Invalid Input ");
			}
			
		}
	}
	

	

}
