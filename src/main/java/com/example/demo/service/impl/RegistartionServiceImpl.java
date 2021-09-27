package com.example.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;
import com.example.demo.service.RegistrationService;

@Service
public class RegistartionServiceImpl implements RegistrationService {

	@Autowired
	UserDao userDao;

	@Override
	public User saveUserInfo(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUserInformation(user);
	}

}
