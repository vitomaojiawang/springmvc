package com.oaec.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/user")
public class UserController {
	@RequestMapping("/login.do")
	public ModelAndView login(HttpServletRequest request,HttpServletResponse response){
		String userName = request.getParameter("userName");
		String pwd = request.getParameter("userPwd");
		//����modelAndView׼��������ݣ�������ͼ
		ModelAndView modelAndView = new ModelAndView();
		
		//����ɹ�����index.jsp ������ת��login.jsp
		if("zhangsan".equals(userName)&&"123".equals(pwd)){
			modelAndView.addObject("userName", userName);
			modelAndView.setViewName("index");
		}else{
			modelAndView.setViewName("login");
		}
		return modelAndView;
		
		
	}
}
