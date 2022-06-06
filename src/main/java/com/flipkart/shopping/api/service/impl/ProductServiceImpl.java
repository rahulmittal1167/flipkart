package com.flipkart.shopping.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flipkart.shopping.api.model.Product;
import com.flipkart.shopping.api.repository.ProductRepo;
import com.flipkart.shopping.api.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepo repo;
	
	@Override
	public Optional<Product> findtheProductById(int id) {
		return repo.findById(id);
	}

	@Override
	public List<Product> getAllTheProducts() {
		return repo.findAll();
	}

	
	public void saveAllTheProducts(List<Product> list){
		repo.saveAll(list);
	}
}
