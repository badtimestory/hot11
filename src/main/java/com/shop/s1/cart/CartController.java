package com.shop.s1.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/cart/*")
public class CartController {

	@Autowired
	private CartService cartService;
	
	//여기
	public void add() throws Exception{
		
	}
	

	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView cartList(ModelAndView mv,CartDTO cartDTO) throws Exception{
		cartDTO = cartService.detail(cartDTO);
		mv.addObject("cart",cartDTO);
		mv.setViewName("cart/detail");
		return mv;
	}
	@RequestMapping(value="delete")
	public String delete(CartDTO cartDTO) throws Exception{
		int result = cartService.delete(cartDTO);
		return "redirect:./list";
	}
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mv, CartDTO cartDTO) throws Exception{
		List<CartDTO> ar = cartService.list(cartDTO);
		mv.addObject("list",ar);
		mv.setViewName("cart/list");
		return mv;
	}
	
}
