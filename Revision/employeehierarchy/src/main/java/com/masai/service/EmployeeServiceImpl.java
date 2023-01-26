package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exception.EmployeeException;
import com.masai.model.Employee;
import com.masai.model.Manager;
import com.masai.repository.EmployeeRepo;
import com.masai.repository.ManagerRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepo eRepo;
	
	@Autowired
	private ManagerRepo mRepo;

	@Override
	public Employee addEmployee(Employee employee) {
		return eRepo.save(employee);
	}

	@Override
	public Manager addManager(Manager manager) {
		return mRepo.save(manager);
	}

	@Override
	public Employee getEmployee(Integer id) throws EmployeeException {
	Optional<Employee> opt = eRepo.findById(id);
	if(opt.isEmpty())
		throw new EmployeeException("Employee Not Found with id "+id);
	return opt.get();
		
	}

	@Override
	public Manager getManager(Integer id) throws EmployeeException {
		Optional<Manager> opt = mRepo.findById(id);
		if(opt.isEmpty())
			throw new EmployeeException("Manager Not Found with id "+id);
		return opt.get();
	}

	@Override
	public List<Employee> addEmpToMan(Integer eid, Integer mid) throws EmployeeException {
		Optional<Employee> opt1 = eRepo.findById(eid);
		if(opt1.isEmpty())
			throw new EmployeeException("Employee Not Found with id "+eid);
		
		Optional<Manager> opt2 = mRepo.findById(mid);
		if(opt2.isEmpty())
			throw new EmployeeException("Manager Not Found with id "+mid);
		
		Employee emp = opt1.get();
		Manager manager = opt2.get();
		
		emp.setManager(manager);
		manager.getEmps().add(emp);
		eRepo.save(emp);
		mRepo.save(manager);
		return manager.getEmps();
	}

	@Override
	public List<Employee> getEmpsByManId(Integer mid) throws EmployeeException {
		Optional<Manager> opt2 = mRepo.findById(mid);
		if(opt2.isEmpty())
			throw new EmployeeException("Manager Not Found with id "+mid);
		Manager manager = opt2.get();
		if(manager.getEmps().isEmpty())
			throw new EmployeeException("No Employees Found To the manager id "+mid);
		
		return manager.getEmps();
	}

	@Override
	public Manager getManByEmpId(Integer eid) throws EmployeeException {
		
		Optional<Employee> opt1 = eRepo.findById(eid);
		if(opt1.isEmpty())
			throw new EmployeeException("Employee Not Found with id "+eid);
		Manager manager = opt1.get().getManager();
		
		if(manager==null)
			throw new EmployeeException("No Manager Assigned Yet");
		return manager;
		
	}
	
	

}
