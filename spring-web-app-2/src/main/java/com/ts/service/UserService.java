package com.ts.service;

import org.springframework.stereotype.Service;

import com.ts.model.User;

@Service
public class UserService {

	public User userDetails() {
		
		User u = new User();
		
		u.setId(7);
		u.setName("DON");
		u.setAddress("FALTU GALI");
		
		return u;
	}
}
