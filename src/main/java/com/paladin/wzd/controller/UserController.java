package com.paladin.wzd.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;

@Controller
public class UserController {

	@RequestMapping("/user.do")
	public String getUser(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
		
		 request.setAttribute("user", "222");
		 
		
		//response.s endRedirect("jsp/user.jsp");//重定向，页面地址变化，相当于第二次请求，不能保存之前页面的值。
		//request.getRequestDispatcher("jsp/user.jsp").forward(request, response);//请求转发，地址栏不会跳转，将当前请求转发到下一个页面，视为一次请求，能保存之前页面的值。
		return "user";
	}
}
