package com.ts.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.ts.dao.AccountDao;
import com.ts.dao.UserDao;
import com.ts.model.Account;
import com.ts.model.User;

@Service
public class AccountService {

	@Autowired
	AccountDao accountDao;
	@Autowired
	UserDao userDao;
	
	public Account createAccount(Account account) {
		return accountDao.save(account);
	}
	
	public Account createAccountAh(Account account, String accountHolderEmail) {
		User user = userDao.findByEmail(accountHolderEmail).get();
	
		Account ac = new Account();
		ac.setAccountNumber(3434);
		ac.setBalance(200L);
		ac.setUser(user);

		return accountDao.save(ac);
	}
}
