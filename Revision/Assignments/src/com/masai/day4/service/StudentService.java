package com.masai.day4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.masai.day4.bean.Student;

public interface StudentService {
	
	static List<Student> students = new ArrayList<>();
	
	Student addStudent(Student student);
	
	Student removeStudent(Integer id);
	
	Student findStudent(Integer id);
	
	Student findStudentByPincode(String pincode);
	
	Set<Student> sortWithNames();
	
	Set<Integer> setOfMarks();

    List<Student> addAllStudents(List<Student> list);
    
    
}
