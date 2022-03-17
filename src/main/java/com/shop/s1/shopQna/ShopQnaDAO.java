package com.shop.s1.shopQna;

import java.util.List;

import javax.print.attribute.standard.PageRanges;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.shop.s1.util.Pager;

@Repository
public class ShopQnaDAO {
	
	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shop.s1.shopQna.ShopQnaDAO.";
	
	//list
	
	public List<ShopQnaDTO> list(Pager pager) throws Exception{
		return sqlSession.selectList(NAMESPACE+"list", pager);
	}
	
	//total
	
	public Long total(Pager pager) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"total", pager);
	}

	//detail
	
	public ShopQnaDTO detail(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail", shopQnaDTO);
	}
	
	//add
	
	public int add(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", shopQnaDTO);
	}
	
	//update
	
	public int update(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.update(NAMESPACE+"update", shopQnaDTO);
	}
	
	//delete
	public int delete(ShopQnaDTO shopQnaDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", shopQnaDTO);
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
