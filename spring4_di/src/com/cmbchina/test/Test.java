package com.cmbchina.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cmbchina.di.Student;
import com.cmbchina.di.User;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		@SuppressWarnings("resource")
		ApplicationContext aContext = new ClassPathXmlApplicationContext("beans.xml");
//		Student student=(Student)aContext.getBean("student");
//		student.show();
		
		User user = (User)aContext.getBean("user");
		System.out.println(user);
		User u1 = (User)aContext.getBean("u1");
		System.out.println(u1);
	}

}