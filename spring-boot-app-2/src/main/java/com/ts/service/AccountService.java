package com.ts.service;

import java.util.Optional;

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
	
	
	
	public String addBalance(int accountNumber, Long balance) {
		Optional<Account> account = accountDao.findByAccountNumber(accountNumber);
		
		if(account.isPresent()) {
			Account ac = account.get();
			Long currentBalance = ac.getBalance();
			Long finalBalance = currentBalance + balance;
			
			ac.setBalance(finalBalance);
			
			accountDao.save(ac); //--->  {id, an, balace} = {2, 789, 330}
			
			return "Balance has been updated..";
		} else {
			return "Account is not available";
		}
		
		
	}
}
