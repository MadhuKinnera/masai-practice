package com.masai.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.masai.model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
	public List<Employee> findByAddress(String address);

	@Query("select e from Employee e where e.email=?1 and e.password=?2")
	public Employee loginEmployee(String username,String password);

}
