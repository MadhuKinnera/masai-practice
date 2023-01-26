package com.masai.day7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class DeserializeTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("./myobjects.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> obj1 =(List<Student>) ois.readObject();
		List<Employee> obj2 =(List<Employee>) ois.readObject();
		//List<PartTimeEmployee> obj3= (List<PartTimeEmployee>) ois.readObject();
		
		System.out.println(obj1);
		System.out.println(obj2);
		//System.out.println(obj3);		
		System.out.println("Deserialization Done");
		
	}

}
