package com.ts.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.dao.UserDao;
import com.ts.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User register(User user) {
		
		
	List<User> users =	userDao.findByPanOrAadharOrEmail(user.getPan(), user.getAadhar(), user.getEmail());
	
//		if(users.isEmpty()) {
//			return userDao.save(user);
//		} else {
//			return new User();
//		}	
		
		return users.isEmpty()? userDao.save(user) : new User(); 
	}
}
