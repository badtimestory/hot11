package com.shop.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired
	private BoardDAO boardDAO;
	
	public List<BoardDTO> list() throws Exception {
		return boardDAO.list();
	}

}
