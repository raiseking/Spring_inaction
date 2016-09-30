package com.cmbchina.log;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLog implements MethodBeforeAdvice{
	/**
	 * @param method ָ�����õķ�������
	 * @param args �����õķ����Ĳ���
	 * @param target �����õķ�����Ŀ�����
	 */
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		// TODO �Զ����ɵķ������
		System.out.println(target.getClass().getName()+"��"+method.getName()+"������ִ��");
	}
	
}