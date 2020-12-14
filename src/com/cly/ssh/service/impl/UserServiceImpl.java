package com.cly.ssh.service.impl;

import com.cly.ssh.dao.UserDao;
import com.cly.ssh.model.User;
import com.cly.ssh.service.UserService;

public class UserServiceImpl implements UserService{

	private UserDao userDao;
	
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public User userLogin(User user) {
		// TODO Auto-generated method stub
		return userDao.userLogin(user);
	}

}
