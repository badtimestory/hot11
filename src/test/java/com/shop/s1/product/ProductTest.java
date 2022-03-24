package com.shop.s1.product;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;
import com.shop.s1.board.BoardDTO;

public class ProductTest extends MyjunitTest{
	
	@Autowired
	private ProductDAO productDAO;
	
	// check
	@Test
	public void DAOTest() throws Exception {
		assertNotNull(productDAO);
	}
	
	// List Test
	@Test
	public void listTest() throws Exception {
		List<ProductDTO> ar = productDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	// Insert Test
	// @Test
	public void addTest() throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setP_name("에어컨");
		productDTO.setP_price(699800L);
		productDTO.setP_stock(5L);
		productDTO.setP_detail("여름 필수품입니다");
		
		int result = productDAO.add(productDTO);
		assertEquals(1, result);
	}
	
	// detail Test
	@Test
	public void detailTest() throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setP_num(1L);
		productDTO = productDAO.detail(productDTO);
		assertNotNull(productDTO);	
	}
	
	// delete Test
	@Test
	public void deleteTest() throws Exception {
		ProductDTO productDTO = new ProductDTO();
		productDTO.setP_num(5L);
		int result = productDAO.delete(productDTO);
		assertEquals(1, result);
	}
}
