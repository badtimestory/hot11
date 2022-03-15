package com.shop.s1.board;

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
}
