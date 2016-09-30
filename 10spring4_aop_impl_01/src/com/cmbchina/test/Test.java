package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.service.UserService;

/**
 * ��aopʵ����Ҫ�����aopalliance.jar��aspectjweaver.jar�������ļ�������������
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