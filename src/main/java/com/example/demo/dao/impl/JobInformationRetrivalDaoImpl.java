package com.example.demo.dao.impl;

import java.time.LocalDateTime;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.JobInformationRetrivalDao;
import com.example.demo.entity.JobInformationRetrival;
import com.example.demo.entity.User;
import com.example.demo.repository.JobInformationRetrivalRepo;

@Component
public class JobInformationRetrivalDaoImpl implements JobInformationRetrivalDao {
	
	@Autowired
	JobInformationRetrivalRepo jobInfoRetrivalRepo;
	

	@Override
	public JobInformationRetrival saveUserIdAndDate(User user) {
		// TODO Auto-generated method stub
		JobInformationRetrival jobInfoRetrival = new JobInformationRetrival();
		jobInfoRetrival.setUserId(user.getId());
		
		String dateAndTime = LocalDateTime.now().toString();
		jobInfoRetrival.setdateAndTime(dateAndTime);
		
		
		jobInfoRetrivalRepo.saveAndFlush(jobInfoRetrival);
		return jobInfoRetrival;
	}

}
