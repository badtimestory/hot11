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
}
