package com.ts.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	Optional<User> findByPan(String pan);
}
