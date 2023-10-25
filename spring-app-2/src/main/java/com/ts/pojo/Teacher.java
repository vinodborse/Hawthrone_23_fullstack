package com.ts.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Teacher {

	@Autowired
	private Student s;
	
	@Autowired
	private School sch;
	
	public void teacherData() {
		System.out.println("Hello Teacher");		
		s.stdDetails();
		sch.schoolName();
	}
}
