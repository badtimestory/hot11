package com.shop.s1.orders;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.cart.CartDTO;
import com.shop.s1.memberJoin.MemberJoinDTO;

@Controller
public class OrdersController {

	@Autowired
	private OrdersService ordersService;
	
	
	//주문 상세 목록
	@RequestMapping(value="/orders/orderView",method=RequestMethod.GET)
	public String orderView(HttpSession session, @RequestParam("n") String orderid, OrdersDetailDTO ordersDetailDTO, Model model) throws Exception{
		System.out.println("get order view");
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		String m_id=memberJoinDTO.getM_id();
		
		ordersDetailDTO.setM_id(m_id);
		ordersDetailDTO.setOrderid(orderid);
		
		List<OrderListDTO> orderView= ordersService.orderView(ordersDetailDTO);
		
		model.addAttribute("orderView",orderView);
		return "orders/orderView";
	}
	
	//주문 목록
	@RequestMapping(value="/orders/list",method=RequestMethod.GET)
	public String orderList(HttpSession session, OrdersDetailDTO ordersDetailDTO, Model model) throws Exception{
		System.out.println("get order list");
		MemberJoinDTO memberJoinDTO= (MemberJoinDTO)session.getAttribute("member");
		String m_id =memberJoinDTO.getM_id();
		
		ordersDetailDTO.setM_id(m_id);
		List<OrdersDetailDTO> orderList = ordersService.orderList(ordersDetailDTO);
		model.addAttribute("orderList",orderList);
		return "orders/list";
		
		
	}
	
	
	//주문
	@RequestMapping(value="/cart/cartList",method=RequestMethod.POST)
	public String order(HttpSession session, OrdersDetailDTO ordersDetailDTO, OrdersDTO ordersDTO) throws Exception{
		System.out.println("order");
		MemberJoinDTO memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
		String m_id = memberJoinDTO.getM_id();
	
		//주문번호 생성 연/월/일 추출
		Calendar cal= Calendar.getInstance();
		int year = cal.get(Calendar.YEAR);
		String ym = year+ new DecimalFormat("00").format(cal.get(Calendar.MONTH)+1);
		String ymd= ym+ new DecimalFormat("00").format(cal.get(Calendar.DATE));
		String subNum="";
		
		//6자리의 랜덤 숫자로 만들어진 subNum 10의 6승
		for(int i=1; i<=6; i++) {
			subNum+=(int)(Math.random() * 10);
		}

		String orderid=ymd+"_"+subNum;
		
		ordersDetailDTO.setOrderid(orderid);
		ordersDetailDTO.setM_id(m_id);
		
		ordersService.ordersDetail(ordersDetailDTO);
		
		ordersDTO.setOrderid(orderid);
		ordersService.orders(ordersDTO);
		
		ordersService.cartAllDelete(ordersDetailDTO);
		
		return "redirect:../order/list";
	}
	
	
	
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
		int result=ordersService.add(ordersDTO);
		System.out.println("주문완료");
		return "redirect:./list";
	}
	
	@GetMapping(value="add")
	public void add(OrdersDTO ordersDTO, Model model,MemberJoinDTO memberJoinDTO,HttpSession session,CartDTO cartDTO) throws Exception{
		memberJoinDTO=(MemberJoinDTO)session.getAttribute("member");
//		ordersDTO.setM_id(memberJoinDTO.getM_id());
		List<OrdersDTO> ar=new ArrayList<OrdersDTO>();
			
		ordersDTO.setP_num(cartDTO.getP_num());
		ordersDTO=ordersService.detail(ordersDTO);
		model.addAttribute("dto",ordersDTO);
		
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


