package com.shop.s1.orders;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrdersDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shop.s1.orders.OrdersDAO.";
	
	public OrdersDTO detail(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail",ordersDTO);
	}
}
