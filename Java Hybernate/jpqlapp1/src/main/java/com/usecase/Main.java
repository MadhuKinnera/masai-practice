package com.usecase;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import com.model.Address;
import com.model.Customer;
import com.util.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		List<Address> list1 = new ArrayList<>();
	
		
		list1.add(new Address("telangana","warangle","506015","work"));
		list1.add(new Address("maharastra","mumbai","789015","home"));
		list1.add(new Address("tamilnadu","chennai","456021","office"));
		
		Customer customer1 = new Customer("madhu","6281340428","madhu@gmail.com",list1);
		
		List<Address> list2 = new ArrayList<>();
		
		list2.add(new Address("up","dehrudun","782215","work"));
		list2.add(new Address("ap","amravathi","589021","home"));
		list2.add(new Address("mp","bhoopal","678321","office"));
		
		
		 Customer customer2 = new Customer("prasad","9000710058","prasad@gmail.com",list2);
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.persist(customer1);
		em.persist(customer2);
		
		em.getTransaction().commit();
		
		
		System.out.println("Done ");
		
		
		 String jpql = "from cust where id=:idd";
		 
		Query q=  em.createQuery(jpql);
		 
		 q.setParameter("idd", 3);
		 
		 Customer cust =(Customer)q.getSingleResult();
		 
		 List<Address> list  = cust.getAddresses();
		 
		 
		for(Address add : list) {
			System.out.println(add);
		}

		
	}

}
