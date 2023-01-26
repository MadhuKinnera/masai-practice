package com.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.model.Course;
import com.model.Student;
import com.util.EMUtil;

public class Demo3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Student Name ");
		String name = sc.next();
		
		EntityManager em = EMUtil.provideEntityManager();
		
		String jpql = "from Student where name=:nm ";
		
		TypedQuery<Student> q = em.createQuery(jpql,Student.class);
		
		q.setParameter("nm",name);
		
		Student student = q.getSingleResult();
		
		List<Course> courseList = student.getCourses();
		
		System.out.println("Course List of "+name );
		System.out.println("==========================");
		
		courseList.forEach(cl-> System.out.println(cl));
		
		
		
	}

}
