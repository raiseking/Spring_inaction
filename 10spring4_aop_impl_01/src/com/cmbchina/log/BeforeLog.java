package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{
	/**
	 * @param method 指被调用的方法对象
	 * @param args 被调用的方法的参数
	 * @param target 被调用的方法的目标对象
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO 自动生成的方法存根
		System.out.println(target.getClass().getName()+"的"+method.getName()+"方法被执行");
	}
	
}
