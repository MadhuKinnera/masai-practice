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
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo sRepo;
	
	@Autowired
	private CourseRepo cRepo;

	@Override
	public Student addStudent(Student student) throws StudentException {
		 return sRepo.save(student);
	}

	@Override
	public List<Student> getStudents() throws StudentException {
		List<Student> students = sRepo.findAll();
		if(students.isEmpty())
			throw new StudentException("No Students Found ");
		return students;
	}

	@Override
	public Student updateStudent(Integer id, Student student) throws StudentException {
		 Optional<Student> opt = sRepo.findById(id);
		 
		 if(opt.isEmpty())
			 throw new StudentException("Student Not Found with id "+id);
		 
		 return sRepo.save(student);
	}

	@Override
	public Student deleteStudent(Integer id) throws StudentException {
		Optional<Student> opt = sRepo.findById(id);
		
		if(opt.isEmpty())
			 throw new StudentException("Student Not Found with id "+id);
		
		 Student student = opt.get();
		 
		 sRepo.delete(student);
		 return student;
	}

	@Override
	public List<Course> addStudentToCourse(Integer sid, Integer cid) throws StudentException, CourseException {
         Optional<Student> opt = sRepo.findById(sid);
		
		if(opt.isEmpty())
			 throw new StudentException("Student Not Found with id "+sid);
		Student student = opt.get();
		
        Optional<Course> opt2 = cRepo.findById(cid);
		
		if(opt.isEmpty())
			 throw new StudentException("Course Not Found with id "+cid);
		Course course = opt2.get();
		
		student.getCourses().add(course);
		
		  sRepo.save(student);
		  
		  return sRepo.findById(sid).get().getCourses();
		 
	}

}
