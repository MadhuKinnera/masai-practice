package com.eval1.q1;

import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;

public class EmpSalComp implements Comparator<Map.Entry<Employee, String>> {

	@Override
	public int compare(Entry<Employee, String> o1, Entry<Employee, String> o2) {
		
		  Employee e1 = o1.getKey();
		  Employee e2 = o2.getKey();
		  
		 return e1.getSalary() > e2.getSalary() ? +1 : -1 ;
	}




	}


