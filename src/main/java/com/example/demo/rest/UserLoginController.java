package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.User;
import com.example.demo.service.LoginService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class UserLoginController {
	
	@Autowired
	LoginService loginService;
	
	@GetMapping("/login/{id}")
	public ResponseEntity<User> LoginController(@PathVariable Integer id) {
		return new ResponseEntity<User>(loginService.getUserById(id), HttpStatus.OK);
	}

}
