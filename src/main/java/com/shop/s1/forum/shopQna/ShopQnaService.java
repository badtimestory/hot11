package com.shop.s1.forum.shopQna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shop.s1.forum.ForumDTO;
import com.shop.s1.forum.ForumService;
import com.shop.s1.util.Pager;

@Service
public class ShopQnaService implements ForumService {
	@Autowired
	private ShopQnaDAO shopQnaDAO;
	
	@Override
	public List<ForumDTO>list(Pager pager) throws Exception{
		pager.makeRow();
		
		pager.makeNum(shopQnaDAO.total(pager));
		
		return shopQnaDAO.list(pager);

	}
	
	@Override
	public ForumDTO detail(ForumDTO forumDTO) throws Exception{
		return shopQnaDAO.detail(forumDTO);
	} 
	
	@Override
	public int add(ForumDTO forumDTO) throws Exception{
		return shopQnaDAO.add(forumDTO);
	}
	
	@Override
	public int delete(ForumDTO forumDTO) throws Exception{
		return shopQnaDAO.delete(forumDTO);
	}
	
	@Override
	public int update(ForumDTO forumDTO) throws Exception{
		return shopQnaDAO.update(forumDTO);
	}
	
	
	public int reply(ShopQnaDTO shopQnaDTO) throws Exception{
		ForumDTO forumDTO = shopQnaDAO.detail(shopQnaDTO);
		ShopQnaDTO parent = (ShopQnaDTO)forumDTO;
		
		shopQnaDTO.setRef(parent.getRef());
		
		shopQnaDTO.setStep(parent.getStep() +1);
		
		shopQnaDTO.setDepth(parent.getDepth() +1);
		
		int result = shopQnaDAO.stepUpdate(parent);
		
		result = shopQnaDAO.reply(shopQnaDTO);
		
		return result;
		
	}
	

}
