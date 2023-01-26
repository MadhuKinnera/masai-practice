package com.masai.q3.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	public static EntityManager getEMObj() {
		
		 EntityManagerFactory emf =  Persistence.createEntityManagerFactory("accountUnit");
		 
		EntityManager em = emf.createEntityManager();
		
		return em;
		
		
		
		
		
		
		
	}

}
