package com.shop.s1.cart;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.memberJoin.MemberJoinDTO;

public class CartTest {

	@Autowired
	private CartDAO cartDAO;
	
	@Test
	public void detailTest() throws Exception{
		CartDTO cartDTO = new CartDTO();
		cartDTO.setM_id("id");
		cartDTO=cartDAO.detail(cartDTO);
		assertNotNull(cartDTO);
	}
	
}
