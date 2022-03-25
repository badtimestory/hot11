package com.shop.s1.forum;

import java.util.List;

import com.shop.s1.util.Pager;

public interface ForumDAO {
	//list
	public List<ForumDTO> list (Pager pager) throws Exception;
	
	//add
	public int add(ForumDTO forumDTO) throws Exception;
	
	//update
	public int update(ForumDTO forumDTO) throws Exception;
	
	//delete
	public int delete(ForumDTO forumDTO) throws Exception;
	
	//total
	public Long total(Pager pager) throws Exception;
	
	//detail
	public ForumDTO detail(ForumDTO forumDTO) throws Exception;
	

	
	
}
