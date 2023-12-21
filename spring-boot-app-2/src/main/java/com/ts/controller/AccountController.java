package com.ts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ts.model.Account;
import com.ts.service.AccountService;

@RestController
public class AccountController {

	@Autowired
	AccountService accountService;
	
	@PostMapping("/account-create")
	public Account createAccount(@RequestBody Account account ) {
		return accountService.createAccount(account);
	}
	
	@PostMapping("/account-create-ah")
	public Account createAccountAh(@RequestBody Account account, @RequestParam("accountHolder") String accountHolder) {
		return accountService.createAccountAh(account, accountHolder);
	}
	
	@PostMapping("/add-balance")
	public String addBalance(@RequestParam("acn") int accountNumber, @RequestParam("bal") Long balance) {
		return accountService.addBalance(accountNumber, balance);
	}
}
