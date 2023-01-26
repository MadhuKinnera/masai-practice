package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getNameandQuantity",query="select productname,quantity from Product")
@NamedQuery(name="getPriceById", query="select price from Product where id=:idd ")
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int productid;
  private String productname ;
  private int price;
  private int quantity;
  
  
  public Product() {
	// TODO Auto-generated constructor stub
}
  
  
public Product( String productname, int price, int quantity) {
	super();
	this.productname = productname;
	this.price = price;
	this.quantity = quantity;
}
public int getProductid() {
	return productid;
}
public void setProductid(int productid) {
	this.productid = productid;
}
public String getProductname() {
	return productname;
}
public void setProductname(String productname) {
	this.productname = productname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}



@Override
public String toString() {
	return "Product [productid=" + productid + ", productname=" + productname + ", price=" + price + ", quantity="
			+ quantity + "]";
}
  
  
  
  
}
