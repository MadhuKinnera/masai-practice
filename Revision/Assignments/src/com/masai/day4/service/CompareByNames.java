package com.masai.day4.service;

import java.util.Comparator;

import com.masai.day4.bean.Student;

public class CompareByNames implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}


}
