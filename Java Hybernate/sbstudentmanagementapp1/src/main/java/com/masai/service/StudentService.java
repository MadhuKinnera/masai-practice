package com.masai.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.model.Student;
import com.masai.repository.StudentRepo;


public interface StudentService {

	
	public Student registerStudent(Student student);
	public List<Student> getStudents();

}
