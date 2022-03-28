package com.shop.s1.board;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.s1.MyjunitTest;
import com.shop.s1.util.Pager;

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
		Pager pager = new Pager();
		// 시작번호와 끝번호 계산
		pager.makeRow();
		List<BoardDTO> ar = boardDAO.list(pager);
		// 한 페이지에 10개의 글을 보여주기로 함
		System.out.println("게시글 시작번호: " + ar.get(0).getB_num());
		System.out.println("게시글 마지막번호: " + ar.get(9).getB_num());
		System.out.println("가져온 글의 갯수: " + ar.size());
		assertEquals(10, ar.size());
	}
	
	// insert Test
	// @Test
	public void addTest() throws Exception {
		BoardDTO boardDTO = new BoardDTO();
		for (int i = 1; i <= 100; i++) {
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
