package com.shop.s1.orders;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

	@Autowired
	private OrdersDAO ordersDAO;
	
	
	public int delete(OrdersDTO ordersDTO) throws Exception{
		return ordersDAO.delete(ordersDTO);
	}
	
	public int update(OrdersDTO ordersDTO) throws Exception{
		return ordersDAO.update(ordersDTO);
	}
	
	public int add(OrdersDTO ordersDTO) throws Exception {
		return ordersDAO.add(ordersDTO);
	}
	
	public OrdersDTO detail(OrdersDTO ordersDTO) throws Exception{
		return ordersDAO.detail(ordersDTO);
	}
	
	public List<OrdersDTO> list() throws Exception{
		List<OrdersDTO> ar = ordersDAO.list();
		return ar;
	}
	
	//주문 상세 정보 -> orders
	public int orders(OrdersDTO ordersDTO)throws Exception{
		return ordersDAO.orders(ordersDTO);
	}

	//주문 정보 -> ordersDetail
	public int ordersDetail(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return ordersDAO.ordersDetail(ordersDetailDTO);
	}
	
	//카트 비우기
	public int cartAllDelete(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return ordersDAO.cartAllDelete(ordersDetailDTO);
	}
	
	//주문 목록
	public List<OrdersDetailDTO> orderList(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return ordersDAO.orderList(ordersDetailDTO);
	}
	
	//특정 주문 목록
	public List<OrderListDTO> orderView(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return ordersDAO.orderView(ordersDetailDTO);
	}
	
}
