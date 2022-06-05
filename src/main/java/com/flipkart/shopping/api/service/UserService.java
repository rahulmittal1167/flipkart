package com.flipkart.shopping.api.service;

import com.flipkart.shopping.api.model.User;

public interface UserService {

	User findUserByUserName(String username);
	
	User saveUser(User user);
}
