package com.eval1.q1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.standard.JobOriginatingUserName;

public class Demo {
	
	public  Map<Employee, String> sortMapUsingEmployeeSalary(Map<Employee,String> originalMap){
		
		Set<Map.Entry<Employee, String>> set = originalMap.entrySet();
		
		List<Map.Entry<Employee, String>> list = new ArrayList<>(set);
		Collections.sort(list,new EmpSalComp());
		
		Map<Employee, String > newMap = new LinkedHashMap<>();
		
		for(int i=0;i<list.size();i++) {
		newMap.put(list.get(i).getKey(),list.get(i).getValue());
		}
		
		
		

		
		
		return newMap;
	}

	
	public static void main(String[] args) {
		
		Map<Employee , String > hm = new HashMap<>();
	     
		hm.put(new Employee(10,"Madhu",65000),"Telangana");
		hm.put(new Employee(20,"Pavan",70000),"Andhra pradhesh");
		hm.put(new Employee(12,"Raghu",89000),"MP");
		hm.put(new Employee(14,"Ramu",25000),"UP");
		hm.put(new Employee(16,"Gopal",12000),"Kashmir");
		Demo d1 = new Demo();
		
		Map<Employee,String> nhm = d1.sortMapUsingEmployeeSalary(hm);
		
		Set<Map.Entry<Employee, String>> set =nhm.entrySet();
		
		for(Map.Entry<Employee, String> m : set) {
			System.out.println(m.getValue());
			System.out.println("============");
			System.out.println("Employee Id : "+m.getKey().getEmpid());
			System.out.println("Employee Name : "+m.getKey().getName());
			System.out.println("Employee Salary : "+m.getKey().getSalary());
			System.out.println();
		}
	
		
	}

}
