package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.dao.JobInterviewAssignmentDao;
import com.example.demo.entity.JobInterviewAssignment;
import com.example.demo.repository.JobInterviewAssignmentRepo;


@Component
public class JobInterviewAssignmentDaoImpl implements JobInterviewAssignmentDao {

	@Autowired
	JobInterviewAssignmentRepo jobInterviewAssignmentRepo;
	
	
	public List<JobInterviewAssignment> getWholeTable() {
		return jobInterviewAssignmentRepo.findAll();
	}

}
