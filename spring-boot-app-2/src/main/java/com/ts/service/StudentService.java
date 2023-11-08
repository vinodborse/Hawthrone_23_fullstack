package com.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.dao.StudentDao;
import com.ts.model.Student;

@Service
public class StudentService {

	@Autowired
	StudentDao sd;
	
	public Student saveStudent(Student std) {
		return sd.save(std);
	}
	
	public List<Student> allStudents() {
		return sd.findAll();
	}
}
