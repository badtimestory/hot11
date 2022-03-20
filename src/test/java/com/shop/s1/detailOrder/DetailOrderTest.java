package com.shop.s1.detailOrder;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;

public class DetailOrderTest extends MyjunitTest {
	
	@Autowired
	private DetailOrderDAO detailOrderDAO;
	
	// Check
	@Test
	public void DAOtest() throws Exception {
		assertNotNull(detailOrderDAO);
	}
	
	// List Test
	@Test
	public void listTest() throws Exception {
		List<DetailOrderDTO> ar = detailOrderDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	// Detail Test
	@Test
	public void detailTest() throws Exception {
		DetailOrderDTO detailOrderDTO = new DetailOrderDTO();
		detailOrderDTO.setD_num(1L);
		detailOrderDTO = detailOrderDAO.detail(detailOrderDTO);
		assertNotNull(detailOrderDTO);
	}
	
	// Insert Test
	// @Test
	public void addTest() throws Exception {
		DetailOrderDTO detailOrderDTO = new DetailOrderDTO();
		detailOrderDTO.setD_amount(20L);
		int result = detailOrderDAO.add(detailOrderDTO);
		assertEquals(1, result);
	}
	
	// Delete Test
	@Test
	public void deleteTest() throws Exception {
		DetailOrderDTO detailOrderDTO = new DetailOrderDTO();
		detailOrderDTO.setD_num(21L);
		int result = detailOrderDAO.delete(detailOrderDTO);
		assertEquals(1, result);
	}

}
