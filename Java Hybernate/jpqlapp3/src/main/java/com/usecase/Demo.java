package com.usecase;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.Address;
import com.model.Customer;
import com.util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		Customer c1 =  new Customer();
		Customer c2 = new Customer();
		
		c1.setName("Madhu");
		c1.setEmail("madhu@gmail.com");
		c1.setMobile("6281340428");
		
		Address c1a1 = new Address("Telangana","warangal",506015,"home");
		Address c1a2 = new Address("Andhrapradhesh","kadapa",601532,"office");
		
		c1.getAddresses().add(c1a1);
		c1.getAddresses().add(c1a2);
		

		c2.setName("Pavan");
		c2.setEmail("pavan@gmail.com");
		c2.setMobile("8106473951");
		
		Address c2a1 = new Address("Telangana","Hanmakonda",506011,"home");
		Address c2a2 = new Address("Telangana","mahabad",506134,"office");
		
		c2.getAddresses().add(c2a1);
		c2.getAddresses().add(c2a2);
		
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(c1);
		em.persist(c2);
		
		em.getTransaction().commit();
		
		
		String jpql = "from Customer where cid =1";
		
	       Query q = em.createQuery(jpql);
	       
	     Customer c = (Customer) q.getSingleResult();
	     
       List<Address> addlist = c.getAddresses();
       
       
       System.out.println("Addresses are ");
       System.out.println("===============");
       
       addlist.forEach(ad->System.out.println(ad));
 		
		System.out.println("Done ");
		
		
		

	}

}
