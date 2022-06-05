package com.flipkart.shopping.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flipkart.shopping.api.model.User;

public interface UserRepo extends MongoRepository<User, Integer> {

	User findByUsername(String username);
}
