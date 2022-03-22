package com.shop.s1.orders;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shop.s1.orders.OrdersDAO.";
	
	
	public int delete(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete",ordersDTO);
	}
	
	public int update(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update",ordersDTO);
	}
	
	public int add(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add",ordersDTO);
	}
	
	public OrdersDTO detail(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",ordersDTO);
	}
	

	public List<OrdersDTO> list() throws Exception{
		return sqlSession.selectList(NAMESPACE+"list");
	}
}
