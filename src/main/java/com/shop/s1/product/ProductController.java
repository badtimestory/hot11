package com.shop.s1.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.shop.s1.board.BoardDTO;

@Controller
@RequestMapping("product/*")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	// list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		List<ProductDTO> ar = productService.list();
		model.addAttribute("list", ar);
		
		return "product/list";
	}
	
	// detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(ProductDTO productDTO, Model model) throws Exception {
		productDTO = productService.detail(productDTO);
		model.addAttribute("dto", productDTO);
		
		return "product/detail";
	}
	
	// insert
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() throws Exception {}
	
	// insert DB
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(ProductDTO productDTO) throws Exception {
		int result = productService.add(productDTO);
		
		return "redirect:./list";
	}
	
	// update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public String update(ProductDTO productDTO, Model model) throws Exception {
		productDTO = productService.detail(productDTO);
		model.addAttribute("dto", productDTO);
		
		return "product/update";
	}
	
	// update DB
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(ProductDTO productDTO) throws Exception {
		int result = productService.update(productDTO);
		
		return "redirect:./list";
	}
	
	// delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(ProductDTO productDTO) throws Exception {
		int result = productService.delete(productDTO);
		
		return "redirect:./list";	
	}
	
}
