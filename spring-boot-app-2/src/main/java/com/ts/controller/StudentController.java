package com.ts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Student;
import com.ts.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService ss;
	
	@PostMapping("/save-student")
	public Student saveStudent(@RequestBody Student std) {
		return ss.saveStudent(std);
	}
	
	@GetMapping("/all-students")
	public List<Student> allStudents() {
		return ss.allStudents();
	}
	
	
}
