package com.cmbchina.factory;

import com.cmbchina.vo.User;

public class UserFactory {
	public static User newInstance(String name){
		return new User(name);
	}
}
