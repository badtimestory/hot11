package com.shop.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	// list
	public List<BoardDTO> list() throws Exception {
		return boardDAO.list();
	}
	
	// insert
	public int add(BoardDTO boardDTO) throws Exception {
		return boardDAO.add(boardDTO);		
	}

}
