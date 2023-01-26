package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.dto.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	
	@PostMapping("/products")
	public Product registerProductHandler(@RequestBody Product product) throws ProductException {
		return productService.registerProduct(product);
		
	}
	
	@GetMapping("/products")
	public List<Product> getAllProductsHandler() throws ProductException{
		return productService.getAllProducts();
	}
	
	@PutMapping("/products")
	public Product updateProductHandler(@RequestBody Product product) throws ProductException {
		return productService.updateProdcut(product);
	}
	@DeleteMapping("/products/{id}")
	public Product deleteProductByIdHandler(@PathVariable("id") Integer id) throws ProductException {
		return productService.deleteProductById(id);
	}
	
	@GetMapping("/products/{category}")
	public List<Product> getProductsByCategoryHandler(@PathVariable("category") String category) throws ProductException{
		return productService.getsProductByCategory(category);
	}
	
	@GetMapping("/productsdto")
	public List<ProductDTO> getProductNameQtyPriceHandler() throws ProductException{
		
		return productService.getProductNameQtyPrice();
	}
	
	
	

}
