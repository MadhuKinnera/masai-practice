package com.usecase;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.ContractualEmployee;
import com.util.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em  = EMUtil.provideEntityManager();
		
		String jpql = "from ContractualEmployee";
		
		Query q = em.createQuery(jpql);
		
		List<ContractualEmployee> conemps = q.getResultList();
		
		System.out.println("Contractual Employees are ");
		
		System.out.println("=====================");
		
		conemps.forEach(con-> System.out.println(con));
		
		System.out.println("Done");
		
		

	}

}
