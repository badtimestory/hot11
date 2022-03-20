package com.shop.s1.detailOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DetailOrderService {
	
	@Autowired
	private DetailOrderDAO detailOrderDAO;
	
	// list
	public List<DetailOrderDTO> list() throws Exception {
		return detailOrderDAO.list();
	}
	
	// detail
	public DetailOrderDTO detail(DetailOrderDTO detailOrderDTO) throws Exception {
		return detailOrderDAO.detail(detailOrderDTO);
	}
	
	// insert
	public int add(DetailOrderDTO detailOrderDTO) throws Exception {
		return detailOrderDAO.add(detailOrderDTO);
	}
	
	// update 
	public int update(DetailOrderDTO detailOrderDTO) throws Exception {
		return detailOrderDAO.update(detailOrderDTO);
	}
	
	// delete
	public int delete (DetailOrderDTO detailOrderDTO) throws Exception {
		return detailOrderDAO.delete(detailOrderDTO);
	}

}
