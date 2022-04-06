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
	
	// detail
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", productDTO);
	}
	
	// insert
	public int add(ProductDTO productDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", productDTO);
	}
	
	// update
	public int update(ProductDTO productDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", productDTO);
	}
	
	// delete
	public int delete(ProductDTO productDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete", productDTO);
	}
	
	// add file
	public int addFile(ProductFileDTO productFileDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"addFile", productFileDTO);
	}
	
	// File Lookup
	public ProductFileDTO lookUpFile(ProductDTO productDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"lookUpFile", productDTO);
	}
	
}
