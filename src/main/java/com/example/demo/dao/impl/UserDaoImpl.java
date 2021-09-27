package com.example.demo.dao.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.exceptionhandler.ApplicationException;
import com.example.demo.repository.UserRepo;

@Component
public class UserDaoImpl implements UserDao{
	
	@Autowired
	UserRepo userRepo;

	@Override
	public User getUserById(Integer id) {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findById(id);
		if(user.isPresent()) {
			return user.get();
		}
		else {
			throw new ApplicationException("User Not Registered yet!!");
		}
	}
	
	public User saveUserInformation(User user) {
		return userRepo.saveAndFlush(user);
		
	}
	
	

}
