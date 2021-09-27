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
import com.example.demo.service.JobInformationRetrivalService;

@CrossOrigin("*")
@RestController
@RequestMapping("/user")
public class JobInformationRetrivalController {
	
	
	@Autowired
	JobInformationRetrivalService jobinformationRetrivalService;
	
	
	
	@PostMapping("/jobInfoRetrival")
	public ResponseEntity<String[][]> jobInformationRetrivalController(@RequestBody User user) {
		
		return new ResponseEntity<String[][]>(jobinformationRetrivalService.saveRetrivedByInfoAndTime(user), HttpStatus.OK);
	}

}
