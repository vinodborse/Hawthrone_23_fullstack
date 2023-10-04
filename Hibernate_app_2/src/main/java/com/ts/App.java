package com.ts;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cnf = new Configuration()
    											.configure("Aila.xml")
    											.addAnnotatedClass(Student.class)
    											.addAnnotatedClass(Marks.class);
    	SessionFactory sf = cnf.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//---
    	
    	Student s = new Student();
    	
    	s.setRollno(1);
    	s.setName("Vinod");
    	s.setAddress("Pune");
    	
    	session.save(s);
    	
    	Marks m = new Marks();
    	
    	m.setId(101);
    	m.setPer(75);
    	m.setStd(s);
    	
    	session.save(m);
    	//----
    	session.getTransaction().commit();
    	session.close();
    }
}
