package com.cmbchina.service.impl;

import com.cmbchina.dao.UserDao;
import com.cmbchina.service.UserService;

public class UserServiceImpl implements UserService{
	private UserDao userDao = null;
//	private UserDao userDao = new UserDaoMysqlImpl();
//	private UserDao userDao = new UserDaoOracleImpl();
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void getUser(){
		userDao.getUser();
	}

}
