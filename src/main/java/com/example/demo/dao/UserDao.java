package com.example.demo.dao;

import com.example.demo.entity.User;

public interface UserDao {
	
	public User getUserById(Integer id);
	
	public User saveUserInformation(User user);

}
