package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.User;
import com.ts.service.UserService;

@RestController  // @Controller + @ResponseBody
public class UserController {
	
	@Autowired
	UserService us;
	
	@GetMapping("/user")
	public User userDetails() {
		
//		User u = us.userDetails();		
//		return u;
		
		return us.userDetails();
	}
	
}
