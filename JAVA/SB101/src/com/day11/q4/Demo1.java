package com.day11.q4;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) throws Exception{
		
		
		List<Student> students  = new ArrayList<>();
		
		students.add(new Student(10,"Madhu",789,new Address("Telangana","mahabad",506134)));
		students.add(new Student(12,"Pavan",732,new Address("AP","Gudur",506124)));
		students.add(new Student(13,"Sathish",589,new Address("MP","warangal",500112)));
		students.add(new Student(15,"Prasad",719,new Address("Goa","nirmal",509382)));
		students.add(new Student(8,"Raghu",690,new Address("Delhi","karimnagar",500220)));
		
		//System.out.println(students);
	
		FileOutputStream fis = new FileOutputStream("abc.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fis);
		
		oos.writeObject(students);
		
		oos.flush();
		oos.close();
		
		Demo2.deSerialize();
		
	}
	
}
