package com.shop.s1.forum;

import java.util.List;

import com.shop.s1.util.Pager;

public interface ForumService {
	
	public List<ForumDTO> list(Pager pager) throws Exception;
	
	public ForumDTO detail(ForumDTO forumDTO) throws Exception;
	
	public int add(ForumDTO forumDTO) throws Exception;
	
	public int update(ForumDTO forumDTO) throws Exception;
	
	public int delete(ForumDTO forumDTO) throws Exception;
	


}
