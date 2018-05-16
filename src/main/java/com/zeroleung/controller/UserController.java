package com.zeroleung.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zeroleung.domain.User;
import com.zeroleung.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping("doLogin")
	public String dologin(Model model,String userName,String password,HttpServletRequest request){
		User user=userService.doLogin(userName, password);
		if(user!=null){
			request.getSession().setAttribute("message", "登陆成功");
			return "success";
		}else{
			request.getSession().setAttribute("message", "登陆失败");
			return "fail";
		}
		
		
	}
}
