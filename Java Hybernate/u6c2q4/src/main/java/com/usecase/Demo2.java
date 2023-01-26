package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.ContractualEmployee;
import com.model.SalariedEmployee;
import com.util.EMUtil;

public class Demo2 {

	public static void main(String[] args) {
		
		

		EntityManager em  = EMUtil.provideEntityManager();
		
		String jpql = "from SalariedEmployee";
		
		Query q = em.createQuery(jpql);
		
		List<SalariedEmployee> salemps = q.getResultList();
		
		System.out.println("Salaried  Employees are ");
		
		System.out.println("=====================");
		
		salemps.forEach(sal-> System.out.println(sal));
		
		System.out.println("Done");

	}

}
