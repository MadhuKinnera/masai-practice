package com.masai.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.ProductException;
import com.masai.model.Product;
import com.masai.repository.ProductRepo;
import com.masai.utility.EMUtil;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepo productrepo;
	
	@Override
	public boolean addProduct(Product product) {
		
		productrepo.insertProductDetails(product);
		return true;
		 
	}

	@Override
	public List<Product> getAllProducts() {
		List<Product> list = productrepo.getAllProductDetails();
		return list;
	}

	@Override
	public Product getProductById(int productId) throws ProductException {
		Product product = null;
		try {
		
		product = productrepo.findProduct(productId);
		}catch(Exception e) {
			throw new ProductException(e+"product not found ");
		}
		
		return product;
	}

	@Override
	public List<Product> getProductsBetweenPrice(int fromPrice, int toPrice) throws ProductException {
		List<Product> list = null;
		try {
		list = productrepo.getProductInPriceRange(fromPrice, toPrice);
		}catch(Exception e) {
			throw new ProductException(e+"products not found in the range ");
		}
		return list;
	}

}
