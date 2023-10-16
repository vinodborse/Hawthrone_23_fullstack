package com.ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cnf = new Configuration()
				.configure()
				.addAnnotatedClass(Student.class)
				.addAnnotatedClass(Batch.class);

    	SessionFactory sf = cnf.buildSessionFactory();


    	Session session =sf.openSession();


    	session.beginTransaction();

    	//---
    		Student s1 = new Student();
    		
    		s1.setRollno(1);
    		s1.setName("VINOD");
    		s1.setAddress("Pune");
    		//s1.setBatches(batches);
    		
    		Student s2 = new Student();
    		
    		s2.setRollno(2);
    		s2.setName("DON");
    		s2.setAddress("Pune");
    		
    		
    		Batch b1 = new Batch();
    		
    		b1.setId(101);
    		b1.setType("FULLSTACK");
    		b1.setName("HAWTHRON");
    		
    		Batch b2 = new Batch();
    		
    		b2.setId(102);
    		b2.setType("UI");
    		b2.setName("ASTER");
    		
    		List<Batch> batches = Arrays.asList(b1, b2);
    		
    		s1.setBatches(batches);
    		s2.setBatches(batches);
    		
    		
    		session.save(s1);
    		session.save(s2);
    		session.save(b1);
    		session.save(b2);
    	

    	//----
    	
    	session.getTransaction().commit();
    	session.close();
    }
}
