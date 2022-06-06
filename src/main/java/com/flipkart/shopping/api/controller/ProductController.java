package com.flipkart.shopping.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.shopping.api.model.Product;
import com.flipkart.shopping.api.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		
		Optional<Product> product = service.findtheProductById(id);
		return product!=null ? product.get() : null;
	}
	
	@GetMapping("/getAllproducts")
	public List<Product> getProducts(){
		return service.getAllTheProducts();
	}
}
