package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.RegistrationService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserRegistrationContoller {
	
	@Autowired
	RegistrationService registartionService;
	
	@PostMapping("/registration")
	public ResponseEntity<User> registartionController(@RequestBody User user) {
		
		return new ResponseEntity<User>(registartionService.saveUserInfo(user),HttpStatus.OK);
		
	}

}
