package com.flipkart.shopping.api.service;

import java.util.List;
import java.util.Optional;

import com.flipkart.shopping.api.model.Product;

public interface ProductService {

	Optional<Product> findtheProductById(int id);
	
	List<Product> getAllTheProducts();
	
	void saveAllTheProducts(List<Product> list);
}
