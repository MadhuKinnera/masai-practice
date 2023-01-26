package com.day16.q1;

public class Product {
	
	private int productId;
	private String productName;
	private double productPrice;
	
	
	Product(){
		
	}
	
	Product(int id,String name,double price){
		this.productId=id;
		this.productName=name;
		this.productPrice=price;
	}
	

	public int getProductId() {
		return this.productId;
	}
	
	public void setProductId(int id) {
		this.productId=id;
	}
	
	public String getProductName() {
		return this.productName;
	}
	
	public void setProductName(String name) {
		this.productName=name;
	}
	
	public double getProductPrice() {
		return this.productPrice;
	}
	
	public void setProductPrice(double price) {
		this.productPrice=price;
	}
	@Override
	public String toString() {
		
		return "Product Id : "+this.productId+" "+"Product Name :"+this.productName+" "
				+"Product Price : "+this.productPrice;
		
	}

	
}
