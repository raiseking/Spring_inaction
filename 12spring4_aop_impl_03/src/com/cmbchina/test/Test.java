package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.service.UserService;

/**
 * 此aop实现需要引入库aopalliance.jar和aspectjweaver.jar两个库文件，否则编译出错
 * @author jinra
 *
 */
public class Test {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
		UserService  userService = (UserService)aContext.getBean("userService");
		userService.delete();
	}
}
