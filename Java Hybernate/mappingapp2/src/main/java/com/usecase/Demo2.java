package com.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.model.Course;
import com.model.Student;
import com.util.EMUtil;

public class Demo2 {
	
	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Course Name ");
		String course = sc.next();
		
		
		String jpql = "from Course where courseName=:cn ";
		
		TypedQuery<Course> q = em.createQuery(jpql, Course.class);
		
		
		q.setParameter("cn", course);
		
		Course c = q.getSingleResult();
		
		
		List<Student> students = c.getStudents();
		
		
		System.out.println("Students In in Course "+course);
		
		students.forEach(s->System.out.println(s));
		
		System.out.println("Done");
	}

}
