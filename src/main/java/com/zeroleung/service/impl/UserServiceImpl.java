package com.zeroleung.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zeroleung.domain.User;
import com.zeroleung.mapper.UserMapper;
import com.zeroleung.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserMapper userMapper;
	
	
	public User doLogin(String userName, String password) {
		// TODO Auto-generated method stub
		return userMapper.doLogin(userName, password);
	}
	
	

}
