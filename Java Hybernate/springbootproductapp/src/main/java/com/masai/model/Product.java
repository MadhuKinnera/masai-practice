package com.masai.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Product {
	
	    @Id
	    @GeneratedValue(strategy =GenerationType.AUTO)
		private Integer productId;
	    @Size(min = 3, max=20,message = "name should be with in 3-20 characters")
		private String productName;
	    @Min(value = 1,message = "quantity must be more than 1")
		private Integer quantity;
	    @NotNull(message = "price not be null")
		private Double price;
	    @Size(min=3,max=20,message = "category should be with in 3-20 characters")
		private String category;
		
		public Product() {
			// TODO Auto-generated constructor stub
		}

		public Product(String productName, Integer quantity, Double price, String category) {
			super();
			this.productName = productName;
			this.quantity = quantity;
			this.price = price;
			this.category = category;
		}

		public Integer getProductId() {
			return productId;
		}

		public void setProductId(Integer productId) {
			this.productId = productId;
		}

		public String getProductName() {
			return productName;
		}

		public void setProductName(String productName) {
			this.productName = productName;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", productName=" + productName + ", quantity=" + quantity
					+ ", price=" + price + ", category=" + category + "]";
		}
		

}
