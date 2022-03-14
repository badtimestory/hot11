package com.shop.s1.memberJoin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/memberJoin/*")
public class MemeberJoinController {

	@Autowired
	private MemberJoinService memberJoinService;
	
	@RequestMapping(value="join",method=RequestMethod.POST)
	public String join(MemberJoinDTO memberJoinDTO) throws Exception{
		int result= memberJoinService.join(memberJoinDTO);
		return "redirect:../";
	}
	@RequestMapping(value="join",method=RequestMethod.GET)
	public void join() throws Exception{
		
	}
}
