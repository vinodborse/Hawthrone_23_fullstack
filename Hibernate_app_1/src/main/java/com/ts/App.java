package com.ts;

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
    		
    	//----
    	session.close();
    }
}
