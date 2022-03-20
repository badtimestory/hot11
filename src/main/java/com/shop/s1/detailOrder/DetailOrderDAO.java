package com.shop.s1.detailOrder;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class DetailOrderDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.shop.s1.detailOrder.DetailOrderDAO.";
	
	// list
	public List<DetailOrderDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	// detail
	public DetailOrderDTO detail(DetailOrderDTO detailOrderDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", detailOrderDTO);
	}
	
	// insert
	public int add(DetailOrderDTO detailOrderDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", detailOrderDTO);
	}
	
	// update
	public int update(DetailOrderDTO detailOrderDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", detailOrderDTO);
	}
	
	// delete
	public int delete(DetailOrderDTO detailOrderDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete", detailOrderDTO);
	}
	

}
