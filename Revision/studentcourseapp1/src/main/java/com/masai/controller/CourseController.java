package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.service.CourseService;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService cService;
	
	@PostMapping("/courses/add")
	public ResponseEntity<Course> addCourseHandler(@RequestBody Course course) throws CourseException{
		return new ResponseEntity<Course>(cService.addCourse(course),HttpStatus.OK);
	}
	
	@GetMapping("/courses")
	public ResponseEntity<List<Course>> getCoursesHandler() throws CourseException{
		return new ResponseEntity<List<Course>>(cService.getCourses(),HttpStatus.OK);
	}
	
	@PutMapping("/courses/{id}")
	public ResponseEntity<Course> updateCourseHandler(@PathVariable Integer id ,@RequestBody Course course) throws CourseException{
		return new ResponseEntity<Course>(cService.updateCourse(id, course),HttpStatus.OK);
	}
	
	@DeleteMapping("/courses/{id}")
	public ResponseEntity<Course> deleteCourseHandler(@PathVariable Integer id) throws CourseException{
		return new ResponseEntity<Course>(cService.deleteCourse(id),HttpStatus.OK);
	}
	
	@PostMapping("/courses/{sid}/{cid}")
	public ResponseEntity<List<Student>> addStudentToCourseHandler(@PathVariable("sid") Integer sid,@PathVariable("cid") Integer cid) throws CourseException, StudentException{
		return new ResponseEntity<List<Student>>(cService.AddCourseToStudent(sid, cid),HttpStatus.OK);
	}

}
