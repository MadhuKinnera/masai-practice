package com.masai.s2d2.q2.utility;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMUtil {
	
	private static EntityManagerFactory emf;
	
	static {
		emf = Persistence.createEntityManagerFactory("employeeUnit");
	}
	
	public static EntityManager provideConnection() {
		
		return emf.createEntityManager();
		
	}

}
