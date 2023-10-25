package com.ts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ts.pojo.Teacher;

public class App 
{
    public static void main( String[] args )
    {

    	ApplicationContext ac = new ClassPathXmlApplicationContext("config.xml");
    	Teacher t = ac.getBean("tch", Teacher.class);
    	

    	t.teacherData();
    }
}
