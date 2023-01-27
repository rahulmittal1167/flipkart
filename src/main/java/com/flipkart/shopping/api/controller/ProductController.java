package com.flipkart.shopping.api.controller;

import java.util.List;
import java.util.Optional;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.shopping.api.model.Product;
import com.flipkart.shopping.api.service.ProductService;

@RestController
@Slf4j
public class ProductController {

	@Autowired
	ProductService service;
	
	@GetMapping("/product/{id}")
	public Product getProductById(@PathVariable int id) {
		log.info("Getting Product by Id {} ", id);
		Optional<Product> product = service.findtheProductById(id);
		log.info("Product Returned value is {}", product);
		return product!=null ? product.get() : null;
	}
	
	@GetMapping("/getAllproducts")
	public List<Product> getProducts(){
		log.info("Getting all the Products ######3");
		return service.getAllTheProducts();
	}
}
