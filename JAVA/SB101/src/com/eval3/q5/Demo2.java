package com.eval3.q5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

public class Demo2 {
	
	public static List<Student> deserialize() throws Exception {
		FileInputStream fis = new FileInputStream("studentdata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		List<Student> newStudent =(List<Student>)ois.readObject();
		return newStudent;
		
	}

}
