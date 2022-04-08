package com.shop.s1.wishlist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;



@Repository
public class WishlistDAO {

	@Autowired
	private SqlSession sqlSession;
	private final String NAMESPACE="com.shop.s1.wishlist.WishlistDAO.";
	
	//list
	public List<WishlistListDTO> list(WishlistListDTO wishlistListDTO) throws Exception{
		return sqlSession.selectList(NAMESPACE+"wishlistList", wishlistListDTO);
	}
	

	//detail
	public WishlistDTO detail(WishlistDTO wishlistDTO) throws Exception{
		return sqlSession.selectOne(NAMESPACE+"detail", wishlistDTO);
	}
	
	//add
	public int add(WishlistDTO wishlistDTO) throws Exception{
		return sqlSession.insert(NAMESPACE+"add", wishlistDTO);
	}
	
	//delete
	public int delete(WishlistDTO wishlistDTO) throws Exception{
		return sqlSession.delete(NAMESPACE+"delete", wishlistDTO);
	}
	

	
}