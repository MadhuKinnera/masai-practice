package com.usecase;

import javax.persistence.EntityManager;

import com.model.Course;
import com.model.Student;
import com.util.EMUtil;

public class Demo1 {

	public static void main(String[] args) {
		
		EntityManager em =  EMUtil.provideEntityManager();
		
		Student s1 = new Student("madhu","madhu@gmail.com","6281340428");
		
		Student s2 = new Student("sathish","sathish@gmail.com","8766757774");
		
		
		Course c1 = new Course("java","4months",4000);
		
		Course c2 = new Course("hibernate","3months",2000);
		
		Course c3 = new Course("springboot","1month",10000);
		
		Course c4 = new Course("mysql","2months",3500);
		

		s1.getCourses().add(c1);
		s1.getCourses().add(c2);
		s1.getCourses().add(c4);
		
		s2.getCourses().add(c1);
		s2.getCourses().add(c3);
		s2.getCourses().add(c4);
		
		
		c1.getStudents().add(s1);
		c1.getStudents().add(s2);
		
		c2.getStudents().add(s1);
		
		c3.getStudents().add(s2);
		
		c4.getStudents().add(s1);
		c4.getStudents().add(s2);
		
		System.out.println("Inserting started ....");
		
		em.getTransaction().begin();
		
		em.persist(s1);
		em.persist(s2);
		
		em.getTransaction().commit();

		
		System.out.println("Done");

	}

}
