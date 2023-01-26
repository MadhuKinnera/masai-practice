package com.usecase;

import javax.persistence.EntityManager;

import com.model.Address;
import com.model.Employee;
import com.util.EMUtil;

public class Demo {

	public static void main(String[] args) {
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp1 = new Employee();
		emp1.setName("Madhu");
		emp1.setSalary(10000);
		emp1.setHomeAddress(new Address("Telangana","Mahabad",506134));
		emp1.setOfficeAddress(new Address("Telangana","karimnagar",572376));
		
		Employee emp2 = new Employee();
		emp2.setName("Pavan");
		emp2.setSalary(40000);
		emp2.setHomeAddress(new Address("Telangana","Jagityal",506032));
		emp2.setOfficeAddress(new Address("Telangana","adilabad",572300));
		

		
		Employee emp3 = new Employee();
		emp3.setName("Prasad");
		emp3.setSalary(20000);
		emp3.setHomeAddress(new Address("Telangana","Jangom",532145));
		emp3.setOfficeAddress(new Address("Telangana","nizambad",503829));

		
		
		Employee emp4 = new Employee();
		emp4.setName("Sathish");
		emp4.setSalary(50000);
		emp4.setHomeAddress(new Address("Telangana","Jayshanker",543521));
		emp4.setOfficeAddress(new Address("Telangana","siricilla",576111));

		
		em.getTransaction().begin();
		
		em.persist(emp1);
		em.persist(emp2);
		em.persist(emp3);
		em.persist(emp4);
		
		em.getTransaction().commit();
		
		em.close();
		
		System.out.println("Done");
		
		

	}

}
