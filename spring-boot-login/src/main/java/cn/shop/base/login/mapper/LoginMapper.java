package cn.shop.base.login.mapper;

import org.apache.ibatis.annotations.Param;

import cn.shop.base.login.entity.Login;

public interface LoginMapper {
	
	Login select(@Param("loginAccount")String loginAccount,@Param("pwd")String pwd);
	
}
