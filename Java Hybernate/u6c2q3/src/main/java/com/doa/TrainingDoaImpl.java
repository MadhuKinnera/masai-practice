package com.doa;

import java.util.List;

import com.exception.CourseException;
import com.exception.TeacherException;
import com.model.Course;
import com.model.Student;
import com.model.Teacher;

public class TrainingDoaImpl implements TrainingDoa {

	@Override
	public void addCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerStudent(Student student, int courseId) throws CourseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void assignTeacherWithCourse(int teacherId, int courseId) throws TeacherException, CourseException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Student> getAlltheStudentsByCourseName(String courseName) throws CourseException {
		// TODO Auto-generated method stub
		return null;
	}

}
