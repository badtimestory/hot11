package com.shop.s1.memberJoin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/memberJoin/*")
public class MemeberJoinController {

	@Autowired
	private MemberJoinService memberJoinService;
	
	@RequestMapping(value="mypage",method=RequestMethod.GET)
	public ModelAndView mypage(HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		memberJoinDTO = memberJoinService.mypage(memberJoinDTO);
		mv.setViewName("memberJoin/mypage");
		mv.addObject("dto",memberJoinDTO);
		
		return mv;
	}
	
	
	@RequestMapping(value="logout",method=RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public String login(HttpSession session, MemberJoinDTO memberJoinDTO,String remember, Model model,HttpServletResponse response) throws Exception{
		System.out.println("remember : "+remember);
		
		//이부분 remember에서 "1"이랑 같은걸 꺼내오거나  한사람의 정보를가져오니까?
		if(remember!=null&&remember.equals("1")) {
			
			Cookie cookie = new Cookie("remember", memberJoinDTO.getId());
			cookie.setMaxAge(-1);
			
			response.addCookie(cookie);
			
		}else {
			Cookie cookie = new Cookie("remember", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		
		memberJoinDTO=memberJoinService.login(memberJoinDTO);
		String message="Login fail";
		String loginPath="./login";
		
		if(memberJoinDTO!=null) {
			session.setAttribute("member",memberJoinDTO);
			message="Login Success";
			loginPath="../";
			
		}
		model.addAttribute("path",loginPath);
		model.addAttribute("message",message);
		String path="common/result";
		return path;
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public void login(Model model,@CookieValue(value="rememberID",defaultValue ="",required = false) String rememberID) throws Exception{
		
	}
	
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(MemberJoinDTO memberJoinDTO) throws Exception{
		int result= memberJoinService.join(memberJoinDTO);
		return "redirect:../";
	}
	@RequestMapping(value="join",method=RequestMethod.GET)
	public void join() throws Exception{
		
	}
}
