package com.shop.s1.detailOrder;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("detailOrder/*")
public class DetailOrderController {
	@Autowired
	private DetailOrderService detailOrderService;
	
	// List
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		List<DetailOrderDTO> ar = detailOrderService.list();
		model.addAttribute("list", ar);
		
		return "detailOrder/list";
	}
	
	// Update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(DetailOrderDTO detailOrderDTO, Model model) throws Exception {
		detailOrderDTO = detailOrderService.detail(detailOrderDTO);
		model.addAttribute("dto", detailOrderDTO);
	
		return "detailOrder/update";
	}
	
	// Update DB
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(DetailOrderDTO detailOrderDTO) throws Exception {
		int result = detailOrderService.update(detailOrderDTO);
		
		return "redirect:./list";
	}
	
	// delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(DetailOrderDTO detailOrderDTO) throws Exception {
		int result = detailOrderService.delete(detailOrderDTO);
		
		return "redirect:./list";
	}

}
