package com.shop.s1.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {

	@Autowired
	private OrdersDAO ordersDAO;
	
	public OrdersDTO detail(OrdersDTO ordersDTO) throws Exception{
		return ordersDAO.detail(ordersDTO);
	}
}
