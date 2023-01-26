package com.day11.q4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.function.Consumer;

public class Demo2 {

	
	public static void deSerialize() throws ClassNotFoundException, IOException {
		
		FileInputStream fis = new FileInputStream("abc.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		List<Student> students2  =(List<Student>) ois.readObject();
	
		Consumer<List<Student>> c = st->{
	st.forEach(s->{
		System.out.println("Roll "+s.roll);
		System.out.println("Name "+s.name);
		System.out.println("Marks "+s.marks);
		System.out.println("State "+s.address.state);
		System.out.println("City "+s.address.city);
		System.out.println("Pincode "+s.address.pincode);
		System.out.println("============================");
		System.out.println();
	});
		};
		
		
		c.accept(students2);
	}

}
