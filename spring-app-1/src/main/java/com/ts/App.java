package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    /*	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	
    	Student s1 = new Student();
    	System.out.println(s1);
    	Student s2 = new Student();
    	System.out.println(s2);
    	Student s3 = new Student();
    	System.out.println(s3);
    	
    	System.out.println("=================================");
    	
    	
    	Common c1 = ac.getBean("cm", Common.class);
    	System.out.println(c1);
    	Common c2 = ac.getBean("cm", Common.class);
    	System.out.println(c2);
    	Common c3 = ac.getBean("cm", Common.class);
    	System.out.println(c3);
    	
    	*/
    	
    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	User u = ac.getBean("u", User.class);
    	
    	
    	System.out.println("HELLO "+ u.getName());
    	
//    	User u1 = new User(2, "FALTU GALI", "Don");
//    	
//    	System.out.println("Hello "+ u1.getName());
//    	
    }
}
