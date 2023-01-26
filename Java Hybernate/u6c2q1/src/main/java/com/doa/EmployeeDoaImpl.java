package com.doa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.exception.DepartmentException;
import com.exception.EmployeeException;
import com.model.Department;
import com.model.Employee;
import com.util.EMUtil;

public class EmployeeDoaImpl implements EmployeeDoa{
	

	@Override
	public void addDepartment(Department dept) {
		
		EntityManager em = EMUtil.provideEntityManager();
		em.getTransaction().begin();
		
		em.persist(dept);
		
		em.getTransaction().commit();
		
	}

	@Override
	public void addEmployee(Employee emp) {
		
		EntityManager em1 = EMUtil.provideEntityManager();
		
		em1.getTransaction().begin();
		
		em1.persist(emp);
		
		em1.getTransaction().commit();
		
	}

	@Override
	public void registerEmployeeTODepartment(int empId, int deptId) throws EmployeeException, DepartmentException {
		 
		 Department dept = null;
		 Employee emp  = null;
		
		
		EntityManager em = EMUtil.provideEntityManager();
		
		
		try {
		    dept = em.find(Department.class,deptId);
		}catch(Exception e ) {
			throw new DepartmentException(e+" department not found ");
		}
		 
		try {
		   emp = em.find(Employee.class, empId);
		 
		 em.getTransaction().begin();
		 
		 dept.getEmployees().add(emp);
		 
		 em.getTransaction().commit();
		 
		}catch(Exception e) {
			throw new EmployeeException(e+" registration failed Employee Not Found  ");
		}
		
	}

	@Override
	public List<Employee> getAllEmployeeWithDeptName(String deptName) throws EmployeeException {
		 
		 List<Employee> employees = null;	
		
		try {
		 
		EntityManager em = EMUtil.provideEntityManager();
		  
		 
		  
		  String jpql = "from Department where deptName=:dn";
		  
		   Query q = em.createQuery(jpql);
		   
		   q.setParameter("dn", deptName);
		   
		   Department dept=(Department) q.getSingleResult();
		   
		   
		   
		   employees = dept.getEmployees();
		}catch(Exception e) {
			throw new EmployeeException(e + " Department Not Found ");
		}
		   
		   return employees;
		  
	}

	@Override
	public Department getDepartmentDetailsByEmployeeId(int empId) throws DepartmentException {
		Department dept = null;
		
		try {
		EntityManager em = EMUtil.provideEntityManager();
		
		Employee emp = em.find(Employee.class,empId);
		
		dept = emp.getDept();
		}catch(Exception e) {
			throw new DepartmentException(e+" Employee Not Found ");
		}
		
		return dept;
		
	}

	
}
