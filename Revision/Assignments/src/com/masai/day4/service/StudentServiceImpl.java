package com.masai.day4.service;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

import com.masai.day4.bean.Student;

public class StudentServiceImpl implements StudentService{
	

	@Override
	public Student addStudent(Student student) {
		StudentService.students.add(student);
		return student;
		
	}

	@Override
	public Student removeStudent(Integer id) {
		Student st = null;
		List<Student> list =StudentService.students.stream().filter(s->s.getId()==id).collect(Collectors.toList());
		if(!list.isEmpty()) st=list.get(0);
		StudentService.students.remove(st);
		
		return st;
	}

	@Override
	public Student findStudent(Integer id) {
		for(Student s : StudentService.students) {
			if(s.getId()==id) return s;
		}
		
		return null;
		
	}

	@Override
	public Student findStudentByPincode(String pincode) {
		for(Student s : StudentService.students) {
			if(s.getAddress().getPincode().equals(pincode)) return s;
		}
		
		return null;
	}

	@Override
	public Set<Student> sortWithNames() {
		Set<Student> treeset = new TreeSet<>(new CompareByNames());
		
		for(Student s : StudentService.students) {
			treeset.add(s);
		}
		
		return treeset;
	}

	@Override
	public Set<Integer> setOfMarks() {
		return StudentService.students.stream().map(s->s.getMarks()).collect(Collectors.toSet());
	}

	@Override
	public List<Student> addAllStudents(List<Student> list) {
		StudentService.students.addAll(list);
		
		return StudentService.students;
	}

}
