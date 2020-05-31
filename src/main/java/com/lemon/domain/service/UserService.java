package com.lemon.domain.service;

import org.springframework.stereotype.Service;

import com.lemon.domain.annotation.Cluster;
import com.lemon.domain.mapper.User;

public interface UserService {

	User findByName(String name);
	
	int insert(String id,String name,String pass);
		
}