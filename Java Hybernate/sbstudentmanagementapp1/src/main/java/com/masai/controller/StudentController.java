package com.masai.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.model.Student;
import com.masai.service.StudentService;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class StudentController {
	
	@Autowired
	private StudentService sService;
	
	@PostMapping("/students")
	public ResponseEntity<Student> registerStudentHandler(@RequestBody Student student){

		 Student st = sService.registerStudent(student);
		 
		 return new ResponseEntity<Student>(st,HttpStatus.CREATED);
		
	}
	@GetMapping("/students")
	public ResponseEntity<List<Student>> getAllStudentsHandler(){
		List<Student> students = sService.getStudents();
		
		return new ResponseEntity<List<Student>>(students,HttpStatus.OK);
	}
	
	
	

}
