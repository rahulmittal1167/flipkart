package com.flipkart.shopping.api.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.flipkart.shopping.api.model.Product;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepo extends MongoRepository<Product, Integer>{

    @Query("{$or : [{ 'name' : { $regex: ?0 } }, {'category' : { $regex: ?0 }}, {'description' : { $regex: ?0 }}]}")
    List<Product> getProductByFilter(String desc, Pageable pageable);
}
