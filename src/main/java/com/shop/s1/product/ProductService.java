package com.shop.s1.product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	// list
	public List<ProductDTO> list() throws Exception{
		return productDAO.list();
	}
	
	// detail
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
		return productDAO.detail(productDTO);
	}
	
	// insert
	public int add(ProductDTO productDTO) throws Exception {
		return productDAO.add(productDTO);
	}
	
	// update
	public int update(ProductDTO productDTO) throws Exception {
		return productDAO.update(productDTO);
	}
	
	// delete
	public int delete(ProductDTO productDTO) throws Exception {
		return productDAO.delete(productDTO);
	}
	


}
