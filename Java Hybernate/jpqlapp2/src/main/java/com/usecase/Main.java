package com.usecase;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.model.College;
import com.model.Student;
import com.util.EMUtil;

public class Main {

	public static void main(String[] args) {
		
		EntityManager em = EMUtil.provideEntityManager();
		Scanner sc = new Scanner(System.in);
		
		
		College college1 = new College();
		
		college1.setCollegeName("SVS GROUP OF INSTITUTIONS ");
        college1.setCollegeAddress("HANMAKONDA");
        
        College college2 = new College();
        
        college2.setCollegeName("SR COLLEGE");
        college2.setCollegeAddress("WARANGAL");
		
        Student s1 = new Student("madhu","6281340428","madhu@gmail.com",college1);
        Student s2 = new Student("ramu","483268476","ramu@gmail.com",college1);
        Student s3 = new Student("raghu","648238768","raghu@gmail.com",college1);
        Student s4 = new Student("rajesh","988378732","rajesh@gmail.com",college1);
        
        Student s5 = new Student("prasad","6281340428","prasad@gmail.com",college2);
        Student s6 = new Student("pavan","483268121","pavan@gmail.com",college2);
        Student s7 = new Student("sathish","6743238768","sathish@gmail.com",college2);
        Student s8 = new Student("raju","9886345432","raju@gmail.com",college2);
        
        college1.getStudents().add(s1);
        college1.getStudents().add(s2);
        college1.getStudents().add(s3);
        college1.getStudents().add(s4);
        
        
     
        college2.getStudents().add(s5);
        college2.getStudents().add(s6);
        college2.getStudents().add(s7);
        college2.getStudents().add(s8);
        
        
        em.getTransaction().begin();
        em.persist(college1);
        em.persist(college2);
        em.getTransaction().commit();
        
     
        String jpql1="from College where collegeId=1 ";
        
          Query q1 = em.createQuery(jpql1);
         
          
          String jpql2 = "from Student where roll=4 ";
          
          Query q2 = em.createQuery(jpql2);
          
          
            College obj = (College) q1.getSingleResult();
            
            List<Student>  students = obj.getStudents();
            
            System.out.println("Student Details are ");
            System.out.println("====================");
            
            System.out.println(students);
            
              Student st = (Student) q2.getSingleResult();
              College clg = st.getCollege();
             
         
         System.out.println("College Details are ");
         System.out.println("====================");
         System.out.println(clg);
         
        
        
        em.close();
        
        
    
        
	}

}
