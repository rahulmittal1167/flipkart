package com.flipkart.shopping.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.flipkart.shopping.api.model.User;
import com.flipkart.shopping.api.service.impl.UserServiceImpl;

@RestController
public class UserController {

	@Autowired
	UserServiceImpl service;
	
	@PostMapping(value = "/signUp")
	public ResponseEntity<String> signUp(@RequestBody User user){
		
		if(user!=null && user.getUsername()!=null) {
			User user_db = service.findUserByUserName(user.getUsername());
			if(user_db!=null) {
				return new ResponseEntity<String>("User Alread Exists",HttpStatus.UNAUTHORIZED);
			}else {
				service.saveUser(user);
			}
		}
		return new ResponseEntity<String>("SignUp Successfully",HttpStatus.OK);
	}
	
	@PostMapping(value = "/login")
	public ResponseEntity<String> login(@RequestBody User user){
		
		if(user!=null) {
			User user_db = service.findUserByUserNameAndPassword(user.getUsername(), user.getPassword());
			
			if(user_db!=null) {
				return new ResponseEntity<String>("Login Successfull",HttpStatus.OK);
			}else {
				return new ResponseEntity<String>("Invalid Login",HttpStatus.UNAUTHORIZED);
			}
		}
		return null;
	}

}
