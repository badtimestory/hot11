package com.shop.s1.shopQna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import com.shop.s1.util.Pager;

@Service
public class ShopQnaService {
	@Autowired
	private ShopQnaDAO shopQnaDAO;

	
	public List<ShopQnaDTO>list(Pager pager) throws Exception{
		pager.makeRow();
		
		Long totalCount = shopQnaDAO.total(pager);
		pager.makeNum(totalCount);
		List<ShopQnaDTO> ar = shopQnaDAO.list(pager);
		
		return ar;

	}
	
	
	public ShopQnaDTO detail(ShopQnaDTO shopQnaDTO) throws Exception{
		return shopQnaDAO.detail(shopQnaDTO);
	}
	
	
	public int add(ShopQnaDTO shopQnaDTO) throws Exception{
		return shopQnaDAO.add(shopQnaDTO);
	}
	
	
	public int delete(ShopQnaDTO shopQnaDTO) throws Exception{
		return shopQnaDAO.delete(shopQnaDTO);
	}
	
	
	public int update(ShopQnaDTO shopQnaDTO) throws Exception{
		return shopQnaDAO.update(shopQnaDTO);
	}
	
	public int reply(ShopQnaDTO shopQnaDTO) throws Exception{
		
		
		ShopQnaDTO parent =(ShopQnaDTO)shopQnaDTO;
		
		shopQnaDTO.setRef(parent.getRef());
		
		shopQnaDTO.setStep(parent.getStep()+1);
		
		shopQnaDTO.setDepth(parent.getDepth()+1);
		
		int result = shopQnaDAO.stepUpdate(parent);
		
		result = shopQnaDAO.reply(shopQnaDTO);
		
		return result;
		
	}
	

}
