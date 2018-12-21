package com.sample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.mongo.document.Users;
import com.sample.mongo.repo.UserRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping ("/api")
public class TestController {

	@RequestMapping("/hello")
	 public String greet() {
	  return "Hello from the other side!!!";
	 }
	  

	@Autowired
	UserRepository userRepository; 
	

	@RequestMapping (method= RequestMethod.GET)
	 public List<Users> getAll(){
		 return userRepository.findAllByOrderByName();
	 }
	
	 
	@RequestMapping (method= RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public void saveUser(@RequestBody Users user) {

		userRepository.save(user);
	}
	 
}
