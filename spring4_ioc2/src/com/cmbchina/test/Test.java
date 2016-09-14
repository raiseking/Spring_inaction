package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.dao.impl.UserDaoMysqlImpl;
import com.cmbchina.dao.impl.UserDaoOracleImpl;
import com.cmbchina.service.UserService;
import com.cmbchina.service.impl.UserServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		UserService userService = (UserService)context.getBean("service");
		userService.getUser();
	}
}
