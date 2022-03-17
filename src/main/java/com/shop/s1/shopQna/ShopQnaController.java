package com.shop.s1.shopQna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.util.Pager;

@Controller
@RequestMapping("/shopQna/*")
public class ShopQnaController {
	@Autowired
	private ShopQnaService shopQnaService;
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String list(Pager pager, Model model) throws Exception{
		List<ShopQnaDTO> ar = shopQnaService.list(pager);
		model.addAttribute("list",ar);
		
		return "shopQna/list";
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public String detail(ShopQnaDTO shopQnaDTO, Model model) throws Exception{
		shopQnaDTO = shopQnaService.detail(shopQnaDTO);
		model.addAttribute("dto", shopQnaDTO);
		
		return"shopQna/detail";
	}
	
	@RequestMapping(value="add", method = RequestMethod.GET)
	public void add() throws Exception{
		
	}
	//DB에 insert
	@RequestMapping(value="add", method = RequestMethod.POST)
	public String add(ShopQnaDTO shopQnaDTO) throws Exception{
		int result = shopQnaService.add(shopQnaDTO);
		
		return "redirect:./list";
	}

	@RequestMapping(value="delete")
	public String delete(ShopQnaDTO shopQnaDTO) throws Exception{
		int result = shopQnaService.delete(shopQnaDTO);
		
		return "redirect:./list";
	}
	
	@RequestMapping(value="update", method = RequestMethod.GET)
	public void update(ShopQnaDTO shopQnaDTO, Model model) throws Exception{
		shopQnaDTO = shopQnaService.detail(shopQnaDTO);
		model.addAttribute("dto", shopQnaDTO);
	}
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(ShopQnaDTO shopQnaDTO) throws Exception{
		int result = shopQnaService.update(shopQnaDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value="reply", method = RequestMethod.GET)
	public ModelAndView reply(ShopQnaDTO shopQnaDTO, ModelAndView mv) throws Exception{
		mv.addObject("dto",shopQnaDTO);
		mv.setViewName("shopQna/reply");
		return mv;
	}
	
	@RequestMapping(value="reply", method = RequestMethod.POST)
	public ModelAndView reply(ShopQnaDTO shopQnaDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result = shopQnaService.reply(shopQnaDTO);
		
		mv.setViewName("redirect:./list");
		
		return mv;
	}
}
