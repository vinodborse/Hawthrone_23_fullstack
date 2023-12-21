package com.ts.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ts.dao.AccountDao;
import com.ts.dao.UserDao;
import com.ts.model.Account;
import com.ts.model.User;

@Service
public class UserService {

	@Autowired
	UserDao userDao;
	
	@Autowired
	AccountDao accountDao;
	
	public User register(User user) {
		
		
	List<User> users =	userDao.findByPanOrAadharOrEmail(user.getPan(), user.getAadhar(), user.getEmail());
	
//		if(users.isEmpty()) {
//			return userDao.save(user);
//		} else {
//			return new User();
//		}	
		
		return users.isEmpty()? userDao.save(user) : new User(); 
	}
	
	
	
	public String createAccount(User user) {
		List<User> users =	userDao.findByPanOrAadharOrEmail(
															  user.getPan(), 
															  user.getAadhar(), 
															  user.getEmail());
		
		if(users.isEmpty()) {
			
			userDao.save(user); 
			
			Random rand = new Random();
			   

	        int accNo = rand.nextInt(1000);
			
			Account account = new Account();
			account.setAccountNumber(accNo);
			account.setBalance(0L);
			account.setUser(user);
			
			accountDao.save(account);
			
			return "Your account has been created successfully";
		} else {
			return "You can;t create an account ";
		}
	}
}
