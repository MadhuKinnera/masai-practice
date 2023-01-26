package com.usecase;

import javax.persistence.EntityManager;

import com.model.ContractualEmployee;
import com.model.Employee;
import com.model.SalariedEmployee;
import com.util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		SalariedEmployee sal1 = new SalariedEmployee();
		sal1.setEmpName("madhu");
		sal1.setEmail("madhu@gmail.com");
		sal1.setSalary(10000);
		
		SalariedEmployee sal2 = new SalariedEmployee();
		sal2.setEmpName("pavan");
		sal2.setEmail("pavan@gmail.com");
		sal2.setSalary(30000);
		
		SalariedEmployee sal3 = new SalariedEmployee();
		sal3.setEmpName("ram");
		sal3.setEmail("ram@gmail.com");
		sal3.setSalary(20000);
		
		SalariedEmployee sal4 = new SalariedEmployee();
		sal4.setEmpName("raghu");
		sal4.setEmail("raghu@gmail.com");
		sal4.setSalary(50000);
		
		
		ContractualEmployee con1 = new ContractualEmployee();
		con1.setEmpName("con1");
		con1.setMobileNumber("739743322");
		con1.setCostofperday(2000);
		con1.setNoOfWorkingDays(4);
		
		ContractualEmployee con2 = new ContractualEmployee();
		con2.setEmpName("con2");
		con2.setMobileNumber("7397432633");
		con2.setCostofperday(3000);
		con2.setNoOfWorkingDays(5);
		

		ContractualEmployee con3 = new ContractualEmployee();
		con3.setEmpName("con3");
		con3.setMobileNumber("739741423");
		con3.setCostofperday(6000);
		con3.setNoOfWorkingDays(9);
		

		ContractualEmployee con4 = new ContractualEmployee();
		con4.setEmpName("con4");
		con4.setMobileNumber("7397439889");
		con4.setCostofperday(2000);
		con4.setNoOfWorkingDays(2);
		
		em.getTransaction().begin();
		
		em.persist(sal1);
		em.persist(sal2);
		em.persist(sal3);
		em.persist(sal4);
		
		em.persist(con1);
		em.persist(con2);
		em.persist(con3);
		em.persist(con4);
		
		em.getTransaction().commit();
		
		
		System.out.println("Done");

		

	}

}
