package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private int productId;
		private String productName;
		private int quantity;
	    private int	price;
	    
	    public Product() {
			// TODO Auto-generated constructor stub
		}
	    
	   
		public Product(String productName, int quantity, int price) {
			super();
			this.productName = productName;
			this.quantity = quantity;
			this.price = price;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
					+ ", price=" + price + "]";
		}
	    
	    


}
