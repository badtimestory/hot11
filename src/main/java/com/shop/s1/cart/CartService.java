package com.shop.s1.cart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {

	@Autowired
	private CartDAO cartDAO;
	
	public CartDTO cartList(CartDTO cartDTO) throws Exception{
		return cartDAO.cartList(cartDTO);
	}
	
	public int delete(CartDTO cartDTO) throws Exception{
		return cartDAO.delete(cartDTO);
	}
}
