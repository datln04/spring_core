package com.datpt.ecomerce_demo.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.datpt.ecomerce_demo.model.User;


@Repository
public interface UserService extends JpaRepository<User, Integer>{
	
}
