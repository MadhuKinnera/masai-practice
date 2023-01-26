package com.day1.q2;

public class Product {
	private int productId;
	private String productName;
	private int productPrice;
	Product(){
		
	}
	Product(int productId,String productName,int productPrice){
		this.productId=productId;
		this.productName=productName;
		this.productPrice=productPrice;
	}
	
	
	public void setProductId(int productId) {
		this.productId=productId;
	}
	public int getProductId() {
		return this.productId;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	public String getProductName() {
		return this.productName;
	}
	
	
	public void setProductPrice(int productPrice) {
		this.productPrice=productPrice;
	}
	public int getProductPrice() {
		return this.productPrice;
	}
	

}
