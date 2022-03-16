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
	@Test
	public void ListTest() throws Exception {
		List<BoardDTO> ar = boardDAO.list();
		assertNotEquals(0, ar.size());
	}
	
	// insert Test
	@Test
	public void addTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		for (int i = 1; i <= 10; i++) {
			boardDTO.setTitle("테스트"+i);
			boardDTO.setWriter("탑텐");
			boardDTO.setContents("내용테스트"+i);
			
			int result = boardDAO.add(boardDTO);
			assertEquals(1, result);
		}
	}
	
}
