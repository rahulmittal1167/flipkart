package com.flipkart.shopping.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
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
		return repo.findAll(PageRequest.of(0, 10)).toList();
	}

	public void saveAllTheProducts(List<Product> list){
		repo.saveAll(list);
	}

	@Override
	public List<Product> getProductByFilter(String desc) {
		Pageable pageable = PageRequest.of(0,10);
		return repo.getProductByFilter(desc, pageable);
	}
}
