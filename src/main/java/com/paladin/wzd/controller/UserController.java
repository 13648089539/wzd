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
		 
		
		//response.s endRedirect("jsp/user.jsp");//�ض���ҳ���ַ�仯���൱�ڵڶ������󣬲��ܱ���֮ǰҳ���ֵ��
		//request.getRequestDispatcher("jsp/user.jsp").forward(request, response);//����ת������ַ��������ת������ǰ����ת������һ��ҳ�棬��Ϊһ�������ܱ���֮ǰҳ���ֵ��
		return "user";
	}
}
