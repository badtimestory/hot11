package com.shop.s1.review;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;
import com.shop.s1.forum.ForumDTO;
import com.shop.s1.forum.review.ReviewDAO;
import com.shop.s1.forum.review.ReviewDTO;
import com.shop.s1.util.Pager;

public class ReviewTest extends MyjunitTest {
	@Autowired
	private ReviewDAO reviewDAO;
	
	// check
	@Test
	public void DAOTest() throws Exception {
		assertNotNull(reviewDAO);
	}
	
	// List Test
	@Test
	public void listTest() throws Exception {
		Pager pager = new Pager();
		List<ForumDTO> ar = reviewDAO.list(pager);
		assertNotEquals(0, ar.size());
	}
	
	// Insert Test
	// @Test
	public void addTest() throws Exception {
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setP_num(0L);
		reviewDTO.setO_num(0L);
		reviewDTO.setM_id("add Test");
		reviewDTO.setNum(0L);
		reviewDTO.setTitle("input Test");
		reviewDTO.setContents("input Test");
		reviewDTO.setWriter("input Test");
		
		int result = reviewDAO.add(reviewDTO);
		assertEquals(1, result);
	}
	
	// Delete Test
	@Test
	public void deleteTest() throws Exception {
		ReviewDTO reviewDTO = new ReviewDTO();
		reviewDTO.setNum(25L);
		
		int result = reviewDAO.delete(reviewDTO);
		assertEquals(1, result);
	}
		
}
