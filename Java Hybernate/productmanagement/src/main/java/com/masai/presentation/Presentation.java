package com.masai.presentation;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.masai.exceptions.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;

@Controller
public class Presentation {
	
	@Autowired
	private ProductService pService; // dependency
	public void insertProduct(){
	//take the input from the user (Product Details without productId, productId
	//should be generated automatically)and call the appropriate method on
    //pService object.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Product Name ");
		String name = sc.next();
		
		System.out.println("Enter Product Quantity ");
		int quantity = sc.nextInt();
		
		System.out.println("Enter Product Price ");
		int price = sc.nextInt();
		
		Product product = new Product(name,quantity,price);
		
		if(pService.addProduct(product)) {
			System.out.println("Inserted Successfully");
		}else {
			System.out.println("Insertion failed ");
		}
		
		
	}
	public void printAllProduct(){
	//call the getAllProducts method on the pService object and print all
 //product details.
		List<Product>  list = pService.getAllProducts();
		
		for(Product p : list) {
			System.out.println("product Id "+p.getProductId());
			System.out.println("product Name "+p.getProductName());
			System.out.println("product Quantity "+p.getQuantity());
			System.out.println("product Price "+p.getPrice());
			System.out.println("-------------------------------");
			
		}
	}
	public void searchProduct(){
	// take the empId from the user and call the getProductById method
	 //pService obj. And print the appropriate details.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Product id ");
		int productId = sc.nextInt();
		Product p = null;
		
		try {
			p = pService.getProductById(productId);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("product Details are ");
		System.out.println("----------------------");
		System.out.println("product Id "+p.getProductId());
		System.out.println("product Name "+p.getProductName());
		System.out.println("product Quantity "+p.getQuantity());
		System.out.println("product Price "+p.getPrice());
	}
	public void GetProductsWithingPriceRange(){
	// take the price range (fromPrice and toPrice) from the user and call
	//the appropriate method on //pService object and print the Product
	//within the price range,
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Starting price");
		int fromPrice = sc.nextInt();
		
		System.out.println("Enter The Ending Price ");
		int toPrice = sc.nextInt();
		
		List<Product> list = null;
		
		try {
			list = pService.getProductsBetweenPrice(fromPrice, toPrice);
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Product p : list) {
			System.out.println("product Id "+p.getProductId());
			System.out.println("product Name "+p.getProductName());
			System.out.println("product Quantity "+p.getQuantity());
			System.out.println("product Price "+p.getPrice());
			System.out.println("-------------------------------");
			
		}
		
	}


}
