package com.flipkart.shopping.api.service.impl;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.shopping.api.model.Product;
import com.flipkart.shopping.api.model.User;
import com.flipkart.shopping.api.repository.UserRepo;
import com.flipkart.shopping.api.service.UserService;

@Service
@Slf4j
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo repo;
	
	@Override
	public User findUserByUserName(String username) {
		log.info("Finding user by username {}", username);
		if(username!=null)
			return repo.findByUsername(username);
		else
			log.warn("Username is null");
		
		return null;
	}
	
	public User findUserByUserNameAndPassword(String username, String password) {
		log.info("Find User By Username and Password");
		if(username!=null && password!=null)
			return repo.findByUsernameAndPassword(username, password);
		else
			log.warn("Username and Password both are null");
		return null;
	}

	@Override
	public User saveUser(User user) {
		log.info("Saving the User in DB ");
		User savedUser = new User();
		if(user!=null) {
			savedUser = repo.save(user);
		}else {
			log.warn("User is Saved");
		}
		return savedUser;
	}

}
