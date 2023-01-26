package com.masai.s1d5.q2.doa;

import com.masai.s1d5.q2.bean.Employee;

public interface EmployeeDoa {
	
	void save(Employee emp);
	
	String getAddressOfEmp(int empid);
	
	String giveBonusToEmp(int empid, int bonus);
	
	boolean deleteEmp(int empid);

}
