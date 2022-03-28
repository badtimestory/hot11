package com.shop.s1.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.shop.s1.memberJoin.MemberJoinDTO;

public class LoginInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("로그인 Interceptor");
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)request.getSession().getAttribute("member");
		
		//return이 boolean 타입
		boolean check=true;
		if(memberJoinDTO==null) {
			check=false;
			response.sendRedirect("../memberJoin/login");
		}
		return check;
	}
	
	

}
