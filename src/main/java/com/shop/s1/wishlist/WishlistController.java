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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.util.Pager;

@Controller
@RequestMapping(value="/wishlist/*")
public class WishlistController {
	
	@Autowired
	private WishlistService wishlistService;
	
	
	//list
	@RequestMapping(value="wishlistList", method = RequestMethod.GET)
	public ModelAndView wishlistList(ModelAndView mv, WishlistListDTO wishlistListDTO, HttpSession session) throws Exception{
		
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		String m_id=memberJoinDTO.getM_id();
	
		List<WishlistListDTO> wishlistList = wishlistService.list(wishlistListDTO);
		
		mv.addObject("wishlistList", wishlistList);
		
		mv.setViewName("wishlist/list");
		
		return mv;
	}
	

	
	@RequestMapping(value="detail", method =  RequestMethod.GET)
	public ModelAndView detail(ModelAndView mv, WishlistDTO wishlistDTO) throws Exception{
		wishlistDTO=wishlistService.detail(wishlistDTO);
		mv.addObject("wishlist", wishlistDTO);
		mv.setViewName("wishlist/detail");
		return mv;
	}
	

//	@RequestMapping(value="delete", method = RequestMethod.GET)
//	public String delete(WishlistDTO wishlistDTO) throws Exception{
//		int result = wishlistService.delete(wishlistDTO);
//		
//		return"redirect:./list";
//		
//	}
	@ResponseBody
	@RequestMapping(value="delete",method = RequestMethod.POST)
	public ModelAndView delete(ModelAndView mv,HttpSession session,WishlistDTO wishlistDTO) throws Exception{
		System.out.println("delete");
		
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		
		if(memberJoinDTO!=null) {
			wishlistDTO.setM_id(memberJoinDTO.getM_id());
			int result=wishlistService.delete(wishlistDTO);
			mv.addObject("result",result);
			mv.setViewName("common/ajaxResult");
		}else {
			int result=0;
			mv.addObject("result",result);
			mv.setViewName("common/ajaxResult");
		}
		return mv;
	}
	

	
	
	@ResponseBody
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView add(HttpSession session, WishlistDTO wishlistDTO) throws Exception{
		
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		
		ModelAndView mv = new ModelAndView();
	
		if(memberJoinDTO!=null) {
			wishlistDTO.setM_id(memberJoinDTO.getM_id());
		
			int result = wishlistService.add(wishlistDTO);
			
			mv.addObject("result",result);
			
			mv.setViewName("common/ajaxResult");
			}else {
			int result=0;
		
			mv.addObject("result",result);
			
			mv.setViewName("common/ajaxResult");
		
			}
		return mv;
	}
	

}