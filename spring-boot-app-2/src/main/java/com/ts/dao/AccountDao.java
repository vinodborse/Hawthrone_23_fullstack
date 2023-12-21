package com.ts.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.Account;

@Repository
public interface AccountDao extends JpaRepository<Account, Long>{

	Optional<Account> findByAccountNumber(int accountNumber);

}
