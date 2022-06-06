package com.flipkart.shopping.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.shopping.api.model.Product;
import com.flipkart.shopping.api.model.User;
import com.flipkart.shopping.api.repository.UserRepo;
import com.flipkart.shopping.api.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepo repo;
	
	@Override
	public User findUserByUserName(String username) {
		// TODO Auto-generated method stub
		if(username!=null)
			return repo.findByUsername(username);
		
		return null;
	}
	
	public User findUserByUserNameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		if(username!=null && password!=null)
			return repo.findByUsernameAndPassword(username, password);
		
		return null;
	}

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		User savedUser = new User();
		if(user!=null) {
			savedUser = repo.save(user);
		}
		return savedUser;
	}

}
