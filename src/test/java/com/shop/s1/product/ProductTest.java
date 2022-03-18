package com.shop.s1.product;

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
	public void ListTest() throws Exception {
		List<ProductDTO> ar = productDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	// Insert Test
	
	// detail Test
	
	// Update Test
	
	// delete Test
	
	
	

}
