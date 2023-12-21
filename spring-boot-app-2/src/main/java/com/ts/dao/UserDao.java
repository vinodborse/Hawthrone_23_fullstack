package com.ts.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	Optional<User> findByPan(String pan);
	
	List<User> findByPanOrAadharOrEmail(String st1, String st2, String st3);

	Optional<User> findByEmail(String email);
	
	List<User> findByFirstNameAndLastName(String firstName, String lastName);
}
