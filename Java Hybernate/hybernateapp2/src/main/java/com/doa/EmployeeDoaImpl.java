package com.doa;
import com.model.*;
import com.exception.*;
import com.utility.*;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;



public class EmployeeDoaImpl implements EmployeeDoa{

    @Override
	public Employee registerEmployee(Employee employee) throws EmployeeException {
		
		Employee emp = null;
		
       try {
			
		EntityManager em = EMUtil.provideEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(employee);
		
		em.getTransaction().commit();
		
		
		String url = "from Employee where name = :name and address=:add ";
		
		 TypedQuery<Employee> q  = em.createQuery(url,Employee.class);
		 
		 q.setParameter("name",employee.getName());
		 q.setParameter("add",employee.getAddress());
		 
		emp = q.getSingleResult();
		
		em.close();
		
       }catch(Exception e ) {
    	   throw new EmployeeException(e+" registration failed ");
       }

		return emp;
		
		
	
		
	}

	@Override
	public Employee getEmployeeById(int empId) throws EmployeeException {
	         Employee emp = null;
	         
	         
	         try {
	         EntityManager em = EMUtil.provideEntityManager();
	         
	         emp = em.find(Employee.class, empId);
	         
	        
	         }catch(Exception e ) {
	        	 throw new EmployeeException(e+"Employee Not Found ");
	         }
	         
	         
	         
	         return emp;
	}

	@Override
	public Employee deleteEmployeeById(int empId) throws EmployeeException {
		Employee emp= null;
		
		EntityManager em= EMUtil.provideEntityManager();
		
		try {
		
		emp = em.find(Employee.class,empId);
		
		em.getTransaction().begin();
		
		em.remove(emp);
		
		em.getTransaction().commit();
		
		em.close();
		}catch(Exception e) {
			throw new EmployeeException(e+" deletion Failed ");
		}
		
		return emp;
		
	}

	@Override
	public Employee updateEmployee(Employee employee) throws EmployeeException {
		Employee emp = null;
		
		
		try {
		EntityManager em = EMUtil.provideEntityManager();
		
		
		em.getTransaction().begin();
		
		em.merge(employee);
		
		em.getTransaction().commit();
		
		em.close();
		}catch(Exception e ) {
	         throw new EmployeeException(e+" Updation Failed ");
		}
		
		
		return emp;
	}

}
