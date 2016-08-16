package com.cloudCount.platform.amm.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloudCount.platform.amm.dao.impl.UserMapper;
import com.cloudCount.platform.amm.model.User;
import com.cloudCount.platform.amm.service.UserService;

//@Transactional
@Service
public class UserServiceImpl implements UserService{
	
	/**
	 * 
	 */
	@Resource
	public UserMapper userMapper;
	
	/**
	 * add user
	 */
	public void addUser(User user){
		userMapper.addUser(user);
	}

}
