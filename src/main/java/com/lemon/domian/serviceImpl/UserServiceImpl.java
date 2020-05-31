package com.lemon.domian.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lemon.domain.annotation.Cluster;
import com.lemon.domain.mapper.User;
import com.lemon.domain.mapper.UserMapper;
import com.lemon.domain.service.UserService;

@Service(value="userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	@Cluster
	public User findByName(String name) {
		return userMapper.findByName(name);
	}

	@Override
	public int insert(String id, String name, String pass) {
		return userMapper.insert(id, name, pass);
	}

}
