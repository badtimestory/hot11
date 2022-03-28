package com.shop.s1.forum.review;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.s1.forum.ForumDAO;
import com.shop.s1.forum.ForumDTO;

@Repository
public class ReviewDAO implements ForumDAO {
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE = "com.shop.s1.review.ReviewDAO.";
	
	@Override
	public List<ForumDTO> list() throws Exception {
		return sqlSession.selectList(NAMESPACE+"list");
	}
	
	@Override
	public ForumDTO detail(ForumDTO forumDTO) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"detail", forumDTO);
	}
	
	@Override
	public int add(ForumDTO forumDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"add", forumDTO);
	}
	
	@Override
	public int update(ForumDTO forumDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"update", forumDTO);
	}
	
	@Override
	public int delete(ForumDTO forumDTO) throws Exception {
		return sqlSession.delete(NAMESPACE+"delete", forumDTO);
	}
	
	@Override
	public int reply(ForumDTO forumDTO) throws Exception {
		return sqlSession.insert(NAMESPACE+"reply", forumDTO);
	}
	
	@Override
	public int stepUpdate(ForumDTO forumDTO) throws Exception {
		return sqlSession.update(NAMESPACE+"stepUpdate", forumDTO);
	}	
	
}
