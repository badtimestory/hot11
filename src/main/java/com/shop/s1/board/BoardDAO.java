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
	
	// list 출력
	public List<BoardDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	// detail
	public BoardDTO detail(BoardDTO boardDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", boardDTO);
	}
	
	// insert
	public int add(BoardDTO boardDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", boardDTO);
	}
	

	

}
