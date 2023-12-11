package com.ts.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.dao.UserDao;
import com.ts.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	public User register(User user) {
		Optional<User> usr1 = userDao.findByPan(user.getPan());
		//Optional<User> usr2 = userDao.findByAadhar(user.getPan());
		//Optional<User> usr3 = userDao.findByEmail(user.getPan());
		
		if(usr1.isPresent()) {
			return new User();
		//} else if(usr2.isPresent()){
		//	return new User();
		//} else if(usr3.isPresent()) {
		//	return new User();
		} else {
			return userDao.save(user);
		}
		
		
//		if(usr1.isPresent() || usr2.isPresent() || usr3.isPresent()) {
//			return new User();
//		} else {
//			return userDao.save(user);
//		}
		
	}
}
