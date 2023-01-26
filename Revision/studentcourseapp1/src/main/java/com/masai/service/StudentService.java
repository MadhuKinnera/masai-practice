package com.masai.service;

import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface StudentService {
	
	Student addStudent(Student student) throws StudentException;
	
	List<Student> getStudents() throws StudentException;
	
	Student updateStudent(Integer id,Student student) throws StudentException;
	
	Student deleteStudent(Integer id) throws StudentException;
	
	List<Course> addStudentToCourse(Integer sid, Integer cid)throws StudentException,CourseException;

}
