package com.shop.s1.memberJoin;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.ibatis.javassist.bytecode.DuplicateMemberException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.validation.Errors;

import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/memberJoin/*")
public class MemeberJoinController {

	@Autowired
	private MemberJoinService memberJoinService;
	
	
	@RequestMapping(value="update",method=RequestMethod.POST)
	public String update(MemberJoinDTO memberJoinDTO,HttpSession session) throws Exception{
		int result=memberJoinService.update(memberJoinDTO);
		return "redirect:./mypage";
	}
	
	
	@RequestMapping(value="update",method=RequestMethod.GET)
	public ModelAndView update(MemberJoinDTO memberJoinDTO) throws Exception{
		 ModelAndView mv = new ModelAndView();
		 memberJoinDTO=memberJoinService.mypage(memberJoinDTO);
		 mv.setViewName("memberJoin/update");
		 mv.addObject("member",memberJoinDTO);
		 return mv;
	}
	
	
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
		
		
		if(remember!=null&&remember.equals("1")) {
			
			Cookie cookie = new Cookie("remember", memberJoinDTO.getM_id());
			cookie.setMaxAge(-1);
			
			response.addCookie(cookie);
			
		}else {
			Cookie cookie = new Cookie("remember", "");
			cookie.setMaxAge(0);
			response.addCookie(cookie);
		}
		
		memberJoinDTO=memberJoinService.login(memberJoinDTO);
		String message="Login fail";
		String p="./login";
		
		if(memberJoinDTO!=null) {
			session.setAttribute("member",memberJoinDTO);
			message="Login Success";
			p="../";
			
		}
		model.addAttribute("path",p);
		model.addAttribute("message",message);
		String path="common/result";
		return path;
	}
	
	@RequestMapping(value="login",method=RequestMethod.GET)
	public void login(Model model,@CookieValue(value="rememberID",defaultValue ="",required = false) String rememberID) throws Exception{
		
	}
	
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(MemberJoinDTO memberJoinDTO, Errors errors) throws Exception{
		
		int result= memberJoinService.join(memberJoinDTO);
		return "redirect:../";
	}
	@RequestMapping(value="join",method=RequestMethod.GET)
	public void join() throws Exception{
//		model.addAttribute("memberJoinDTO",new MemberJoinDTO());
//		return "join";
		//안되면 join으로 바꿔보기
	}
	@RequestMapping(value="delete")
	public String delete(HttpSession session,MemberJoinDTO memberJoinDTO) throws Exception{
		int result=memberJoinService.delete(memberJoinDTO);
		session.invalidate();
		return "redirect:../";
	}
	@RequestMapping(value="joinCheck",method=RequestMethod.GET)
	public void joinCheck() throws Exception{
		
	}
	
}
