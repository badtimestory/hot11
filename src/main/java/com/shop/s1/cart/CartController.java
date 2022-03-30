package com.shop.s1.cart;

import java.lang.System.Logger;
import java.util.List;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.memberJoin.MemberJoinDTO;

@Controller
@RequestMapping(value="/cart/*")
public class CartController {

	@Autowired
	private CartService cartService;
	
	
	@RequestMapping(value="list",method=RequestMethod.POST)
	public int add(HttpSession session, HttpServletRequest request, HttpServletResponse response,CartDTO cartDTO) throws Exception{
		System.out.println("Cart: "+cartDTO.getM_id());
		if(session.getAttribute("member")!=null) {
			MemberJoinDTO memberJoinDTO = (MemberJoinDTO) session.getAttribute("member");
			Cookie cookie= new Cookie("cart",cartDTO.getM_id());
			cookie.setMaxAge(-1);
			response.addCookie(cookie);
		}
		cartService.add(cartDTO);
		String message="장바구니에 담았습니다.";
		return 1;
	}
	
	
	
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView cartList(ModelAndView mv,CartDTO cartDTO) throws Exception{
		cartDTO = cartService.detail(cartDTO);
		mv.addObject("cart",cartDTO);
		mv.setViewName("cart/detail");
		return mv;
	}
	@RequestMapping(value="delete")
	public String delete(CartDTO cartDTO,Model model) throws Exception{
		int result = cartService.delete(cartDTO);
		
		List<CartDTO> ar = cartService.list(cartDTO);
		model.addAttribute("list",ar);
		
		return "redirect:../";
	}
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mv, CartDTO cartDTO) throws Exception{
		List<CartDTO> ar = cartService.list(cartDTO);
		mv.addObject("list",ar);
		mv.setViewName("cart/list");
		return mv;
	}
	
}
