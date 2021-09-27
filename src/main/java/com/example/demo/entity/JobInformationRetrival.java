package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="job__information_retrived")
public class JobInformationRetrival {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer Id;
	
	@Column(name="user_id", nullable = false)
	private Integer userId;
	
	@Column(name="date_time", nullable = false)
	private String dateAndTime;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getdateAndTime() {
		return dateAndTime;
	}

	public void setdateAndTime(String dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

}
