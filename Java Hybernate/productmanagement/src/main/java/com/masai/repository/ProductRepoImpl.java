package com.masai.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.masai.exceptions.ProductException;
import com.masai.model.Product;
import com.masai.service.ProductService;
import com.masai.utility.EMUtil;

@Repository
public class ProductRepoImpl implements ProductRepo{
	

	@Override
	public boolean insertProductDetails(Product product) {
	 EntityManager em = EMUtil.provideEntityManager();
		 
		 em.getTransaction().begin();
		 em.persist(product);
	     em.getTransaction().commit();	 
         
	     return true;
		
	}

	@Override
	public List<Product> getAllProductDetails() {
List<Product> list = null;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Product";
		
		Query q = em.createQuery(jpql);
		
		list = q.getResultList();
		
		return list;
	}

	@Override
	public Product findProduct(int productId) {
		
Product product = null;
		
		EntityManager em = EMUtil.provideEntityManager();
		
		product = em.find(Product.class,productId);
		
		return product;
	}

	@Override
	public List<Product> getProductInPriceRange(int fromPrice, int toPrice) {
List<Product> list = null;
		
		EntityManager em = EMUtil.provideEntityManager();
		
	
		
		String jpql = "from Product where price >=:fp and price<=:tp";
		
	    Query q = em.createQuery(jpql);
	    
	    q.setParameter("fp", fromPrice);
	    q.setParameter("tp", toPrice);
	    
	    list = q.getResultList();
		
		return list;
	}

}
