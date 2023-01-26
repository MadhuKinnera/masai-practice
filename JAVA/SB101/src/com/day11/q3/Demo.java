package com.day11.q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Demo {

	public static void main(String[] args) {
		 
		Student s1 = new Student(10,"Madhu");
		s1.score=78;
		
		
		//serializing the object
		
		try {
			FileOutputStream fis = new FileOutputStream("abc.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fis);
				oos.writeObject(s1);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//deserializing the object
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("abc.txt");
			   ObjectInputStream ois	= new ObjectInputStream(fis);
			   Student s = (Student)ois.readObject();
			   System.out.println("Name is "+s.name);
			   System.out.println("Score is "+s.score);
		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 
	
		
		
		

	}

}

/*
 * Serialization
 * -------------
 * Storing the state of an object in memory is called serializign
 * 
 * we can store only necessary fields we can make unnecesary states as 
 * transient
 * 
 * The objectOutputStream is used to write data into file
 * 
 * this class cannot communicate directly with the file.
 * 
 * so we need to use the reader object
 * 
 * for that we use FileInputStream object with file name 
 * 
 * 
 * using the ObjectOutputStream Object we can able to serialize the data into file
 * 
 * the essential step in this process is the object which we need to store that need to be implements 
 * serializable interface(Marker Interface)
 * 
 * 
 * Deserialization
 * ---------------
 * 
 * the process of getting the object into ram from a file where it stored is called deserialization
 * 
 * 
 * to read the input from the file we need to create a 
 * FileInputStream obj and pass to ObjectInputStream
 * 
 * using that object we can read data usign readObject() method.
 * 
 * the method return an Object class object to  use the object 
 * we need to downcast that into our object
 * 
 * using that object we can access the data which is in stored using serialization
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */
