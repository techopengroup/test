package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.model.User;
import com.demo.service.UserService;

@CrossOrigin(origins = {"http://localhost:3000/"})
@RestController
@RequestMapping("/api/u1/users")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping(value = "/addUser")
    public User addUser(@RequestBody User user) {
    	User userResponse = userService.addUser(user);
		  return userResponse;
    }
		
}
