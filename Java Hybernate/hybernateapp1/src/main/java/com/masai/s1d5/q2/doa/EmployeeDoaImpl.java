package com.masai.s1d5.q2.doa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.masai.s1d5.q2.bean.Employee;
import com.masai.s1d5.q2.util.EMUtil;

public class EmployeeDoaImpl implements EmployeeDoa {
	
	

	@Override
	public void save(Employee emp) {
		EntityManager em = EMUtil.provideEMObj();
				
		em.getTransaction().begin();
		
		em.persist(emp);
		
		em.getTransaction().commit();
		
		
		em.close();
		System.out.println("Inserted Successfully");
		
	}

	@Override
	public String getAddressOfEmp(int empid) {
		String address = null;
	  EntityManager em=  EMUtil.provideEMObj();
		
		Employee emp = em.find(Employee.class, empid);
		
		address = emp.getAddress();
	
		return address;
	}

	@Override
	public String giveBonusToEmp(int empid, int bonus) {
		
		String msg="Bonus Not added ";
		
		EntityManager em = EMUtil.provideEMObj();
		
		Employee emp = em.find(Employee.class,empid);
		
		em.getTransaction().begin();
		
		emp.setSalary(emp.getSalary()+bonus);
	
		
		em.getTransaction().commit();
		
		msg="Bonus Added ";
		
		em.close();
		
		
		return msg;
		
	}

	@Override
	public boolean deleteEmp(int empid) {
		
		  EntityManager em =  EMUtil.provideEMObj();
		  
		  Employee emp = em.find(Employee.class, empid);
		  
		  em.getTransaction().begin();
		  
		  em.remove(emp);
		     
		  em.getTransaction().commit();
		  
		  em.close();
		  
		  return true;
	}

	
	
	
	
}
