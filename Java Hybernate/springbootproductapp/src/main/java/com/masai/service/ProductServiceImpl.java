package com.masai.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.dto.ProductDTO;
import com.masai.exception.ProductException;
import com.masai.model.Product;
import com.masai.repository.ProductRepo;

@Service
public class ProductServiceImpl implements ProductService {
	
	@Autowired
   private ProductRepo productRepo;

	@Override
	public Product registerProduct(Product p) throws ProductException {
		Product product =  productRepo.save(p);
		if(product!=null)return product;
		else throw new ProductException("Product Registration Failed ");
	}

	@Override
	public List<Product> getAllProducts() throws ProductException {
		
		List<Product> products = productRepo.findAll();
		
		if(products.isEmpty()) {
			throw new ProductException("No Product Exist");
		}
		
		return  products;
	}

	@Override
	public Product updateProdcut(Product p) throws ProductException {
	       
		Optional<Product> opt = productRepo.findById(p.getProductId());
		
		if(opt.isPresent()) {
			productRepo.save(p);
			return p;
		}else {
			throw new ProductException("Product Does not Exist to Update"+p.toString());
		}
	}

	@Override
	public Product deleteProductById(Integer pid) throws ProductException {
		Optional<Product> opt = productRepo.findById(pid);
		if(opt.isPresent()) {
			Product product = opt.get();
			productRepo.delete(product);
			return product;
		}else
			throw new ProductException("Product not exist to delete with productId "+pid);
		
	}

	@Override
	public List<Product> getsProductByCategory(String category) throws ProductException {
		List<Product> products = productRepo.findByCategory(category);
		if(products.isEmpty()) {
			throw new ProductException("No products exist with "+category);
		}else {
			return products;
		}
	}

	@Override
	public List<ProductDTO> getProductNameQtyPrice() throws ProductException {
		List<Product> products = productRepo.findAll();
		
		List<ProductDTO> dtoProducts = new ArrayList<>();
		
		for(Product product : products) {
			dtoProducts
			.add(new ProductDTO(product.getProductName(), product.getQuantity(), product.getPrice()));
		}
		
		if(dtoProducts.isEmpty()) {
			throw new ProductException("No products exist ");
		}else
			return dtoProducts;
	}

}
