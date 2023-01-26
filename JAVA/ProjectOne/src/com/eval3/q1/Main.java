package com.eval3.q1;

public class Main {
	
	
	
	public static Object[] changeArr(Object[] arr) {
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] instanceof Student) {
				Student s=(Student)arr[i];
				int marks=s.getMarks();
				marks=marks+10;
				s.setMarks(marks);
		
			}
			else if(arr[i] instanceof Employee) {
				Employee emp=(Employee)arr[i];
				double salary = emp.getSalary();
				salary+=10000;
				emp.setSalary(salary);
				
			}
			else if(arr[i] instanceof String) {
				String str=(String )arr[i];
				String bag="";
				for(int j=str.length()-1;j>=0;j--) {
					bag=bag+str.charAt(j);
				}
				arr[i]=bag;
			
			}
			else {
			     int x=(int)(arr[i]);
			     x=x+20;
			     arr[i]=x;
		
			}
		
		}
		return arr;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Object[] m={new Student(23, "rakesh", 450),new Employee(12, "Lokesh", 84000),"String",50};
		Object[] x=changeArr(m);
		
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
		//System.out.println(x);
		

	}

}
