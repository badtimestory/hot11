package com.shop.s1.orders;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.memberJoin.MemberJoinDTO;

@Controller
@RequestMapping("/orders/*")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@PostMapping(value="update")
	public String update(OrdersDTO ordersDTO) throws Exception{
		int result=ordersService.update(ordersDTO);
		return "redirect:./detail";
	}
	
	@GetMapping(value="update")
	public void update(OrdersDTO ordersDTO,Model model) throws Exception{
		ordersDTO=ordersService.detail(ordersDTO);
		model.addAttribute("dto",ordersDTO);
	}
	
	@GetMapping(value="detail")
	public ModelAndView detail(ModelAndView mv,OrdersDTO ordersDTO) throws Exception{
		ordersDTO=ordersService.detail(ordersDTO);
		mv.addObject("dto",ordersDTO);
		mv.setViewName("orders/detail");
		return mv;
	}

	@PostMapping(value="add")
	public String add(OrdersDTO ordersDTO) throws Exception{
		System.out.println("주문!!!!!!");
		int result=ordersService.add(ordersDTO);
		System.out.println("주문완료");
		return "redirect:./list";
	}
	
	@GetMapping(value="add")
	public void add(OrdersDTO ordersDTO, Model model,MemberJoinDTO memberJoinDTO,HttpSession session) throws Exception{
		memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		ordersDTO.setM_id(memberJoinDTO.getM_id());
		
		ordersDTO=ordersService.detail(ordersDTO);
		System.out.println("주문??");
		model.addAttribute("dto",ordersDTO);
		System.out.println("주문!!");
		
	}
	
	@RequestMapping(value="delete")
	public String delete(OrdersDTO ordersDTO) throws Exception{
		int result = ordersService.delete(ordersDTO);
		return "redirect:./list";
	}

	//관리자 용도
	@RequestMapping(value="list",method=RequestMethod.GET)
	public ModelAndView list(ModelAndView mv) throws Exception{
		List<OrdersDTO> ar = ordersService.list();
		mv.addObject("list",ar);
		mv.setViewName("orders/list");
	
		return mv;
	}


}


