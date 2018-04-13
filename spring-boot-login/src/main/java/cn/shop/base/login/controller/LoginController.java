package cn.shop.base.login.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.shop.base.login.service.LoginService;

@Controller
public class LoginController {

	@Resource
	private LoginService loginService;
	
	@RequestMapping("/login")
	@ResponseBody
	public String getKey(@RequestParam("loginaccount") String loginaccount,@RequestParam("pwd") String pwd){
		String key = loginService.getKey(loginaccount, pwd);
		return key;
	}
	
	@RequestMapping("/insertLoginAccount")
	@ResponseBody
	public String insertLoginAccount(@RequestParam("loginaccount") String loginaccount,@RequestParam("pwd") String pwd){
		String key = loginService.getKey(loginaccount, pwd);
		return key;
	}
}
