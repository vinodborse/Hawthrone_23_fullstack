package com.ts;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration config = new Configuration()
    												.configure()
    												.addAnnotatedClass(Student.class)
    												.addAnnotatedClass(Employee.class);
    	
    	SessionFactory sf = config.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//---
    		
    		Student s1 = new Student("Vinya" ,"Pune", new Date());
    		Student s2 = new Student("Gauru" ,"Rohan ke dil me", new Date());
    		Student s3 = new Student("Rohan" ,"Pune", new Date());
    		Student s4 = new Student("DON" ,"WORLD", new Date());
    		Student s5 = new Student("Ramu" ,"Kaka gali", new Date());
    		Student s6 = new Student("Anarkali" ,"Salim ki gali", new Date());
    		Student s7 = new Student("Pratik" ,"Pune", new Date());
    		
    		session.save(s1);
    		session.save(s2);
    		session.save(s3);
    		session.save(s4);
    		session.save(s5);
    		session.save(s6);
    		session.save(s7);
    		
    	
    	/*	
    	    Student s1 = new Student();
    		s1.setRollno(2);
    		session.delete(s1);
    	*/	
    		
    	/*
    		Student s1 = session.get(Student.class, 1);  	
    		System.out.println("BEFORE:- " + s1.toString());
    		
    		s1.setName("Vinu");
    		session.update(s1);
    		
    		Student s2 = session.get(Student.class, 1);  	
    		System.out.println("AFTER:- " + s2.toString());
    	*/
    	//----
    	session.getTransaction().commit();
    	session.close();
    }
}
