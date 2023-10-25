package com.ts.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {
	
	@Autowired
	Student s;
	
	public void teacherMethod() {
		System.out.println("HELLO TEACHER");
//		s.studentMethod();
	}
	
	public void tchMethod() {
		System.out.println("HELLO TEACHER");
	}
}
