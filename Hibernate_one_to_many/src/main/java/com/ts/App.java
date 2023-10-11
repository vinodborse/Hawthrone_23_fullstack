package com.ts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cnf = new Configuration()
    											.configure("Aila.xml")
    											.addAnnotatedClass(User.class)
    											.addAnnotatedClass(Document.class);
    	SessionFactory sf = cnf.buildSessionFactory();
    	
    	Session session =sf.openSession();
    	
    	session.beginTransaction();
    	//---
    	User u = new User();
    	u.setUser_id(1);
    	u.setName("Vinod");
    	u.setAddress("Pune");
    	
        	
    	Document d1 = new Document();
    	d1.setDoc_id(101);
    	d1.setType("PAN");
    	d1.setNumber("ws23ed4rf");
    	
    	Document d2 = new Document();
    	d2.setDoc_id(102);
    	d2.setType("AADHAR");
    	d2.setNumber("qawsed123");
    	
    	List<Document> docs = new ArrayList<Document>();
    
    	docs.add(d1);
    	docs.add(d2);

    //	List<Document> documents = Arrays.asList(d1,d2);
    	
    	u.setDocuments(docs);
    	
    	session.save(u);
    	session.save(d1);
    	session.save(d2);
    	

    	//----
    	session.getTransaction().commit();
    	session.close();
    }
}
