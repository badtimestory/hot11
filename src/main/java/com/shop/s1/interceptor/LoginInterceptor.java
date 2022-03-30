package com.shop.s1.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.shop.s1.memberJoin.MemberJoinDTO;

// 로그인이 되어있는지 판별하는 클래스
public class LoginInterceptor extends HandlerInterceptorAdapter {

	@Override
	// Controller 진입 전 실행
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("로그인 Interceptor");
		
		// 내장객체는 다른 영역의 내장 객체를 불러 올 수 있음 (좁은 영역->큰 영역)
		// page -> request -> sesstion -> application(ServletContext)
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)request.getSession().getAttribute("member");
		
		//return이 boolean 타입
		boolean check=true;
		// 로그인 검사
		if(memberJoinDTO==null) {
			check=false;
			response.sendRedirect("../memberJoin/login");
		}
		return check;
	}
	
	

}
