package com.shop.s1.forum.shopQna;

import java.util.List;



import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.s1.forum.ForumDTO;

import com.shop.s1.forum.ForumDAO;
import com.shop.s1.util.Pager;

@Repository
public class ShopQnaDAO implements ForumDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE="com.shop.s1.forum.shopQna.ShopQnaDAO.";
	
	//list
	@Override
	public List<ForumDTO> list(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"list", pager);
	}
	
	//total
	@Override
	public Long total(Pager pager) throws Exception {
		return sqlSession.selectOne(NAMESPACE+"total", pager);
	}

	//detail
	@Override
	public ForumDTO detail(ForumDTO forumDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"detail", forumDTO);
	}

	//add
	@Override
	public int add(ForumDTO forumDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", forumDTO);
	}
	
	//update
	@Override
	public int update(ForumDTO forumDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update", forumDTO);
	}
	
	//delete
	@Override
	public int delete(ForumDTO forumDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", forumDTO);
	}
	
	//reply
	
	public int reply(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"reply", shopQnaDTO);
	}
	
	//stepUpdate

	public int stepUpdate(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"stepUpdate", shopQnaDTO);
	}
}
