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
	
	public int add(CartDTO cartDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add",cartDTO);
	}
	
	public int update(CartDTO cartDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update",cartDTO);
	}
	
	public CartDTO detail(CartDTO cartDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",cartDTO);
	}
	
	public int delete(CartDTO cartDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",cartDTO);
	}
	public List<CartDTO> list(CartDTO cartDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"list",cartDTO);
	}
	
}
