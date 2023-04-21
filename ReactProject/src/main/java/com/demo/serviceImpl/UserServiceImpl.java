package com.demo.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.model.User;
import com.demo.repositories.UserRepository;
import com.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserRepository userRepository;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		User userResponse = userRepository.save(user);
		   return userResponse;
	}

}
