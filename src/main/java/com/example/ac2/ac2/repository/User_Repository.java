package com.example.ac2.ac2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ac2.ac2.entity.User;

@Repository
public interface User_Repository extends JpaRepository<User, Long> {
	
	
}
