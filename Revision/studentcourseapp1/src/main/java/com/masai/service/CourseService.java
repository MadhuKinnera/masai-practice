package com.masai.service;

import java.util.List;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;

public interface CourseService {

	Course addCourse(Course course) throws CourseException;
	
	List<Course> getCourses()throws CourseException;
	
	Course updateCourse(Integer id,Course course)throws CourseException;
	
	Course deleteCourse(Integer id)throws CourseException;
	
	List<Student> AddCourseToStudent(Integer sid,Integer cid)throws CourseException,StudentException;
}
