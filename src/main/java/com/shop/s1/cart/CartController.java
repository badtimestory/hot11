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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.product.ProductDTO;

@Controller
@RequestMapping(value="/cart/*")
public class CartController {

	@Autowired
	private CartService cartService;
	
	//카트담기 
	@ResponseBody
	@RequestMapping(value="add",method=RequestMethod.POST)
	public ModelAndView add(HttpSession session,CartDTO cartDTO) throws Exception{
		
	
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		//System.out.println("getM_id : " + memberJoinDTO.getM_id());
		ModelAndView mv= new ModelAndView();
		if(memberJoinDTO!=null) {
			cartDTO.setM_id(memberJoinDTO.getM_id());		
			int result=cartService.add(cartDTO);
			mv.addObject("result",result);
			mv.setViewName("common/ajaxResult");
			
		}else {
		int result=0;
		mv.addObject("result",result);
		mv.setViewName("common/ajaxResult");
		}
		return mv;
	}
	
	
	
	
	//카트확인 detail -> 카트목록으로 변경 
	@RequestMapping(value="detail",method=RequestMethod.GET)
	public ModelAndView cartList(ModelAndView mv,CartDTO cartDTO) throws Exception{
		cartDTO = cartService.detail(cartDTO);
		mv.addObject("cart",cartDTO);
		mv.setViewName("cart/detail");
		return mv;
	}
	
	// 카트 삭제 낱개
	@ResponseBody
	@RequestMapping(value="deleteCart",method=RequestMethod.POST)
	public ModelAndView delete(ModelAndView mv,HttpSession session,CartDTO cartDTO) throws Exception{
		System.out.println("delete Cart");
		
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		
		
		if(memberJoinDTO!=null) {
			cartDTO.setM_id(memberJoinDTO.getM_id());		
			int result=cartService.delete(cartDTO);
			mv.addObject("result",result);
			mv.setViewName("common/ajaxResult");
			
		}else {
		
		int result=0;
		mv.addObject("result",result);
		mv.setViewName("common/ajaxResult");
		}
		return mv;
	}
	
	//선택삭제
	@ResponseBody
	@RequestMapping(value="selectDelete",method=RequestMethod.POST)
	public ModelAndView delete(ModelAndView mv,HttpSession session,@RequestParam(value="check[]") List<String> chArr,CartDTO cartDTO)throws Exception{
		System.out.println("select delete");
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		
		int result=0;
		Long c_num=0L;
		
		if(memberJoinDTO!=null){
			cartDTO.setM_id(memberJoinDTO.getM_id());
			for(String i : chArr) {
				c_num=Long.parseLong(i);
				cartDTO.setC_num(c_num);
				cartService.delete(cartDTO);
			}
			result=1;
			mv.addObject("result",result);
			mv.setViewName("common/ajaxResult");
			
		}
		return mv;
	}
	
	
	//카트목록
	@RequestMapping(value="cartList",method=RequestMethod.GET)
	public ModelAndView cartList(ModelAndView mv, CartListDTO cartListDTO,HttpSession session) throws Exception{
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		String m_id=memberJoinDTO.getM_id();
		
		List<CartListDTO> cartList = cartService.cartList(cartListDTO);
		
		mv.addObject("cartList",cartList);
		mv.setViewName("cart/cartList");
		return mv;
	}
	

	
}
