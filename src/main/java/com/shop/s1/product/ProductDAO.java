package com.shop.s1.product;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ProductDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.shop.s1.product.ProductDAO.";
	
	// list
	public List<ProductDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
}
