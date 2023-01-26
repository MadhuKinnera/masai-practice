package com.masai;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.masai.exceptions.StudentException;
import com.masai.model.Student;
import com.masai.repository.StudentRepo;
import com.masai.service.StudentService;

@SpringBootTest
class Studentcourseapp1ApplicationTests {

	@Autowired
	private StudentService sService;
	
	@Test
	void contextLoads() {
	}
	
	
	@Test
	void addStudentTest() throws StudentException {
		assertEquals( Student.class,sService.addStudent(new Student(1,"Madhu ", 788)).getClass());
	}
	
	

}
