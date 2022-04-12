package com.shop.s1.product;

import java.io.File;
import java.lang.System.Logger;
import java.net.http.HttpRequest;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

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
	// product/add의 image 추가 parameter name이 photo
	public String add(ProductDTO productDTO, MultipartFile photo) throws Exception {
		System.out.println("ProductController add 메서드 실행");
		System.out.println("파일의 원본이름: " + photo.getOriginalFilename());
		System.out.println("파일의 크기: " + photo.getSize());
				
		int result = productService.add(productDTO, photo);
		
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
	public String update(ProductDTO productDTO, MultipartFile photo) throws Exception {
		// 파일이 등록되어있는지 확인
		if(photo.getOriginalFilename() != null && photo.getOriginalFilename() != "") {
			System.out.println("수정파일의 원본이름: " + photo.getOriginalFilename());
			System.out.println("수정파일의 크기: " + photo.getSize());			
			
			int result = productService.update(productDTO, photo);
		}	
		
		
		return "redirect:./list";
	}
		
	// delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(ProductDTO productDTO) throws Exception {
		int result = productService.delete(productDTO);
		
		return "redirect:./list";	
	}
	
	// file delete
	@PostMapping("fileDelete")
	public ModelAndView fileDelete(ProductFileDTO productFileDTO) throws Exception {
		ModelAndView mv = new ModelAndView();
		System.out.println("ProductController fileDelete Method 파일삭제번호: " + productFileDTO.getPf_num());
		System.out.println("ProductContorller fileDelete Method 파일이름: " + productFileDTO.getPf_fileName());
		int result = productService.fileDelete(productFileDTO);
		System.out.println("삭제여부 확인: " + result);
		
		mv.setViewName("common/ajaxResult");
		mv.addObject("result", result);
		
		return mv;
	}
	
}
