package cn.shop.base.login.service.impl;

import javax.annotation.Resource;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import cn.shop.base.login.entity.Login;
import cn.shop.base.login.mapper.LoginMapper;
import cn.shop.base.login.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService{

	@Resource
	private LoginMapper loginMapper;
	
	public String getKey(String loginaccount, String pwd) {
		Login login =loginMapper.select(loginaccount, pwd);
		String key ="";
		if(login!=null){
			key = DigestUtils.md5DigestAsHex((login.getLoginAccount()+"||"+login.getPwd()).getBytes());
		}
		return key;
	}

	public int insert(Login login) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(Login login) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}
