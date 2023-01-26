package com.masai.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.repository.CourseRepo;
import com.masai.repository.StudentRepo;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private CourseRepo cRepo;

	@Override
	public Course addCourse(Course course) throws CourseException {
		return cRepo.save(course);
	}

	@Override
	public List<Course> getCourses() throws CourseException {
		List<Course> courses =  cRepo.findAll();
		
		if(courses.isEmpty())
			throw new CourseException("Courses Not Available ");
		return courses;
	}

	@Override
	public Course updateCourse(Integer id, Course course) throws CourseException {
		Optional<Course> opt =cRepo.findById(id);
		
		if(opt.isEmpty())
			throw new CourseException("Course Not Found with id "+id);
		
		return cRepo.save(course);
	}

	@Override
	public Course deleteCourse(Integer id) throws CourseException {
Optional<Course> opt =cRepo.findById(id);
		
		if(opt.isEmpty())
			throw new CourseException("Course Not Found with id "+id);
		
		Course course = opt.get();
		
		cRepo.delete(course);
		return course;
	}

	@Override
	public List<Student> AddCourseToStudent(Integer sid, Integer cid) throws CourseException, StudentException {
		
		 Optional<Student> opt = sRepo.findById(sid);
			
			if(opt.isEmpty())
				 throw new StudentException("Student Not Found with id "+sid);
			Student student = opt.get();
			
	        Optional<Course> opt2 = cRepo.findById(cid);
			
			if(opt.isEmpty())
				 throw new StudentException("Course Not Found with id "+cid);
			Course course = opt2.get();
			
			course.getStudents().add(student);
			
			cRepo.save(course);
			
			return cRepo.findById(cid).get().getStudents();
			
			}

}
