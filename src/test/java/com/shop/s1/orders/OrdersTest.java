package com.shop.s1.orders;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;

public class OrdersTest extends MyjunitTest {

	@Autowired
	private OrdersDAO ordersDAO;
	
	
	@Test
	public void delete() throws Exception {
		OrdersDTO ordersDTO= new OrdersDTO();
		ordersDTO.setO_num(4L);
		int result = ordersDAO.delete(ordersDTO);
		assertEquals(1, result);
	}
	
	//@Test
	public void detail() throws Exception{
		OrdersDTO ordersDTO = new OrdersDTO();
		ordersDTO.setM_id("jae");
		ordersDAO.detail(ordersDTO);
		assertNotNull(ordersDTO);
	}
	
	
	
//	VALUES (ORDERS_SEQ.NEXTVAL,#{m_id},#{p_num},#{t_num},#{o_name},sysdate,
//			#{o_phone},#{o_address},#{o_amount},#{o_price},#{o_message},#{o_pay})
//		</insert>
	//@Test
	public void add() throws Exception{
		OrdersDTO ordersDTO=new OrdersDTO();
		ordersDTO.setM_id("jae");
		ordersDTO.setP_num(1L);
		ordersDTO.setT_num(1L);
		ordersDTO.setO_name("hu");
		ordersDTO.setO_phone("010");
		ordersDTO.setO_address("경기도");
		ordersDTO.setO_amount(10L);
		ordersDTO.setO_price(35000L);
		ordersDTO.setO_message("경비실에 맡겨주세요.");
		ordersDTO.setO_pay("카드");
		int result = ordersDAO.add(ordersDTO);
		
		assertEquals(1, result);
		
	}
	
	
	//@Test
	public void list() throws Exception{
		List<OrdersDTO> ar = ordersDAO.list();
		assertEquals(0,ar.size());
	}
	
}
