package com.doa;

import java.util.List;

import com.exception.CourseException;
import com.exception.TeacherException;
import com.model.Course;
import com.model.Student;
import com.model.Teacher;

public interface TrainingDoa {
	
	public void addCourse(Course course);
	
	public void registerStudent(Student student, int courseId)throws CourseException;
	
	public void registerTeacher(Teacher teacher);
	
	public void assignTeacherWithCourse(int teacherId, int courseId) throws
	TeacherException, CourseException;
	
	List<Student> getAlltheStudentsByCourseName(String courseName)throws CourseException;

}
