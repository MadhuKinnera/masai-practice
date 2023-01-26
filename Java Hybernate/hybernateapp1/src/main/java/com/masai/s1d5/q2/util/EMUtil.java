package com.masai.s1d5.q2.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
    
	static {
		emf = Persistence.createEntityManagerFactory("employeeUnit");
	}

	public static EntityManager  provideEMObj() {
		
		return emf.createEntityManager();
		
	}
	
	
}
