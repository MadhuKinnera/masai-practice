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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.masai.exceptions.CourseException;
import com.masai.exceptions.StudentException;
import com.masai.model.Course;
import com.masai.model.Student;
import com.masai.service.StudentService;

@RestController
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	@PostMapping("/students/add")
	public ResponseEntity<Student> addStudentHandler(@RequestBody Student student) throws StudentException{
		return new ResponseEntity<Student>(sService.addStudent(student),HttpStatus.OK);
	}
	
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getStudentsHandler() throws StudentException{
		return new ResponseEntity<List<Student>>(sService.getStudents(),HttpStatus.OK);
	}
	
	@PutMapping("/students/{id}")
	public ResponseEntity<Student> updateStudentHandler(@PathVariable Integer id ,@RequestBody Student student) throws StudentException{
		return new ResponseEntity<Student>(sService.updateStudent(id, student),HttpStatus.OK);
	}
	
	@DeleteMapping("/students/{id}")
	public ResponseEntity<Student> deleteStudentHandler(@PathVariable Integer id) throws StudentException{
		return new ResponseEntity<Student>(sService.deleteStudent(id),HttpStatus.OK);
	}
	
	@PostMapping("/students/{sid}/{cid}")
	public ResponseEntity<List<Course>> addStudentToCourseHandler(@PathVariable("sid") Integer sid,@PathVariable("cid") Integer cid) throws StudentException, CourseException{
		return new ResponseEntity<List<Course>>(sService.addStudentToCourse(sid, cid),HttpStatus.OK);
	}

}
