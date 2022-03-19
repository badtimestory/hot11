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
	
	public CartDTO cartList(CartDTO cartDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"cartList",cartDTO);
	}
	
	public int delete(CartDTO cartDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",cartDTO);
	}
	
	
}
