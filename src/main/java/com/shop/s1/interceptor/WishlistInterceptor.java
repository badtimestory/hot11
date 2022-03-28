package com.shop.s1.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.wishlist.WishlistDAO;


public class WishlistInterceptor extends HandlerInterceptorAdapter{
	
	@Autowired
	private WishlistDAO wishlistDAO;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
	throws Exception{
		boolean check=true;
		
		HttpSession session = request.getSession();
		
		MemberJoinDTO memberJoinDTO = (MemberJoinDTO)request.getSession().getAttribute("member");
		
		
		if(memberJoinDTO == null) {
			response.sendRedirect("/main");
			return false;
		}else {
			return true;
		}
		
	}
}
