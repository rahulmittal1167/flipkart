package com.flipkart.shopping.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.flipkart.shopping.api.model.Product;

public interface ProductRepo extends MongoRepository<Product, Integer>{

}
