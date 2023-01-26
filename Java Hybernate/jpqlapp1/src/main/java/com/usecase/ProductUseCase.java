package com.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Product;
import com.util.EMUtil;

public class ProductUseCase {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		for(int i=10;i<5;i++) {
			System.out.println("insert "+(i+1)+"th product details ");
			System.out.println("=================================");
			
			System.out.println("Enter Name ");
			String pname = sc.next();
			
			System.out.println("Enter price ");
			int price = sc.nextInt();
			
			System.out.println("Enter quantity ");
			int quantity = sc.nextInt();
			
			Product p = new Product(pname,price,quantity);
			
			EntityManager em = EMUtil.provideEntityManager();
			
			em.getTransaction().begin();
			
			em.persist(p);
			
			em.getTransaction().commit();
			
			em.close();
			
    }
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql1 = "from Product where id=:idd";
		
		String jpql2 = "select sum(price) from Product ";
		
		String jpql3 = "from Product where quantity < 5";
		
		Query q1 = em.createNamedQuery("getNameandQuantity");
		
	    List<Object[]> res1 = q1.getResultList();
	    
	    System.out.println("Result for Query1");
	    System.out.println("===================");
	    
	     for(Object[] obj : res1) {
	    	     System.out.println("Name is "+obj[0]);
	    	     System.out.println("Quantity is "+obj[1]);
	 
	    		 System.out.println("-----------------------");
	    	
	     }
	     
	     
	     System.out.println("Result for Query2");
		 System.out.println("===================");
		
		Query q2 = em.createNamedQuery("getPriceById");
		q2.setParameter("idd", 12);
		
		Integer price =(Integer) q2.getSingleResult();
		
		System.out.println("The Price is "+ price);
		
		
		
		System.out.println("Result for Query3");
	    System.out.println("===================");
		
	   	Query q3 = em.createQuery(jpql1);
	   	q3.setParameter("idd",14);
	   	
	   	Product product = (Product) q3.getSingleResult();
	   	
	   	System.out.println("The Product is "+product);
	   	
	   	
	   	
	   	System.out.println("Result for Query4");
	    System.out.println("===================");
	   	
	    Query q4 = em.createQuery(jpql2);
	    
	    Long sum = (Long) q4.getSingleResult();
	    
	    System.out.println("The Sum is "+sum);
	   	
	   	
	    
	   	System.out.println("Result for Query5");
	    System.out.println("===================");
	    
	    Query q5 = em.createQuery(jpql3);
	    
	    List<Product> products = q5.getResultList();
	    
	    products.forEach(p->System.out.println(p));
		
		

		
		
		
		

	}

}
