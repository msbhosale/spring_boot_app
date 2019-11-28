package com.example.demo.com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.com.example.demo.bean.User;

@RestController
public class AppController {

	@GetMapping("/hello")
	public String hello() {
		
		return "Hello";
	}
	
	@GetMapping("/api/users")
	public List<User> getAllUser(){
		
		List<User> users = new ArrayList<User>();
		
		users.add(new User(101, "Ajay", "Patil"));
		users.add(new User(102, "Aniket", "Wadekar"));
		users.add(new User(103, "Shubham", "Sirsat"));
		users.add(new User(104, "Suraj", "Bhosale"));
		
		return users;
	}
}
