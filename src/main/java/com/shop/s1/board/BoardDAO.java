package com.shop.s1.board;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BoardDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.shop.s1.board.BoardDAO.";
	
	public List<BoardDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}

}
