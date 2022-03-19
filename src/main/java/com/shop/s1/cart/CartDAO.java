package com.shop.s1.cart;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CartDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shop.s1.cart.CartDAO.";
	
	public List<CartDTO> cartList(CartDTO cartDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"cartList",cartDTO);
	}
	
	
}
