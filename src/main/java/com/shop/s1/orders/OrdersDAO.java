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
	//주문 상세정보->orders
	public int orders(OrdersDTO ordersDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"orders",ordersDTO);
	}
	
	//주문 정보->ordersDetail
	public int ordersDetail(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"ordersDetail",ordersDetailDTO);
		
	}
	
	//카트 비우기
	public int cartAllDelete(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"cartAllDelete",ordersDetailDTO);
	}
	
	//주문 목록
	public List<OrdersDetailDTO> orderList(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"orderList",ordersDetailDTO);
	}

	//특정 주문 목록
	public List<OrderListDTO> orderView(OrdersDetailDTO ordersDetailDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"orderView",ordersDetailDTO);
	}
	
}
