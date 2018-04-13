package cn.shop.base.login.service;

import cn.shop.base.login.entity.Login;

public interface LoginService {
	
	String getKey(String loginaccount, String pwd);
	
	int insert(Login login);
	
	int update(Login login);
	
}
