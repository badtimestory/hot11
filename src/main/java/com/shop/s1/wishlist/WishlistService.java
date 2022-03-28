package com.shop.s1.wishlist;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shop.s1.util.Pager;

@Service
public class WishlistService {

	@Autowired
	private WishlistDAO wishlistDAO;
	
	//list
	public List<WishlistDTO> list(Pager pager) throws Exception{
		pager.makeRow();
		
		pager.makeNum(wishlistDAO.total(pager));
		
		return wishlistDAO.list(pager);
	
	}
	
	public WishlistDTO detail(WishlistDTO wishlistDTO) throws Exception{
		return wishlistDAO.detail(wishlistDTO);
	}
	
	public int add(WishlistDTO wishlistDTO) throws Exception{
		return wishlistDAO.add(wishlistDTO);
	}
	
	public int delete(WishlistDTO wishlistDTO) throws Exception{
		return wishlistDAO.delete(wishlistDTO);
	}
}
