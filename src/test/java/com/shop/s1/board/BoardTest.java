package com.shop.s1.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;

public class BoardTest extends MyjunitTest{
	
	@Autowired
	private BoardDAO boardDAO;
	
	// DAO cheak
	@Test
	public void DAOTest() throws Exception {
		assertNotNull(boardDAO);
	}
	
	// List Test
	// @Test
	public void ListTest() throws Exception {
		List<BoardDTO> ar = boardDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	// insert Test
	// @Test
	public void addTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		for (int i = 1; i <= 10; i++) {
			boardDTO.setB_title("테스트"+i);
			boardDTO.setB_writer("탑텐");
			boardDTO.setB_contents("내용테스트"+i);
		
			int result = boardDAO.add(boardDTO);
			assertEquals(1, result);
		}
	}
	
	// detail Test
	// @Test
	public void detailTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setB_num(1L);
		boardDTO = boardDAO.detail(boardDTO);
		assertNotNull(boardDTO);
	}
	
	// delete Test
	// @Test
	public void deleteTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		boardDTO.setB_num(10L);
		int result = boardDAO.delete(boardDTO);
		assertEquals(1, result);
	}
	
}
