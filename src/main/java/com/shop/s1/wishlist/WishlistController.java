package com.shop.s1.wishlist;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.util.Pager;

@Controller
@RequestMapping("/wishlist/*")
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String list(Pager pager, Model model) throws Exception{
		List<WishlistDTO> ar = wishlistService.list(pager);
		model.addAttribute("list", ar);
		
		return "wishlist/list";
	}
	
	@RequestMapping(value="detail", method =  RequestMethod.GET)
	public ModelAndView detail(ModelAndView mv, WishlistDTO wishlistDTO) throws Exception{
		wishlistDTO=wishlistService.detail(wishlistDTO);
		mv.addObject("wishlist", wishlistDTO);
		mv.setViewName("wishlist/detail");
		return mv;
	}
	
	@RequestMapping(value="delete")
	public String delete(WishlistDTO wishlistDTO) throws Exception{
		int result = wishlistService.delete(wishlistDTO);
		return "redirect:./list";
	}
	
	@ResponseBody
	@PostMapping(value="add")
	public String add(@ModelAttribute WishlistDTO wishlistDTO, HttpServletRequest httpServletRequest) throws Exception{
		HttpSession session = httpServletRequest.getSession();
		MemberJoinDTO memberJoinDTO= (MemberJoinDTO)session.getAttribute("member");
		if(memberJoinDTO==null) {
			return "memberJoin/join";
		}
		
		int result = wishlistService.add(wishlistDTO);
		
		return result+"";
	}
}
