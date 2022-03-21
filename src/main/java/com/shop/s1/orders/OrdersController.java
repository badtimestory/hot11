package com.shop.s1.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/orders/*")
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	@GetMapping(value="detail")
	public ModelAndView detail(ModelAndView mv,OrdersDTO ordersDTO) throws Exception{
		ordersDTO=ordersService.detail(ordersDTO);
		mv.addObject("order",ordersDTO);
		mv.setViewName("orders/detail");
		return mv;
	}
}
