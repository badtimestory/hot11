package com.shop.s1.forum.shopQna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.shop.s1.forum.ForumDTO;
import com.shop.s1.util.Pager;

@Controller
@RequestMapping("/shopQna/*")
public class ShopQnaController {
	@Autowired
	private ShopQnaService shopQnaService;
	
	@ModelAttribute("forum")
	public String forum() {
		return"shopQna";
	}
	
	@RequestMapping(value="list", method = RequestMethod.GET)
	public String list(Pager pager, Model model) throws Exception{
		List<ForumDTO> ar = shopQnaService.list(pager);
		model.addAttribute("list",ar);
		
		return "forum/list";
	}
	
	@RequestMapping(value="detail", method = RequestMethod.GET)
	public ModelAndView detail(ShopQnaDTO shopQnaDTO) throws Exception{
		ModelAndView mv= new ModelAndView();
		ForumDTO forumDTO = shopQnaService.detail(shopQnaDTO);
		mv.addObject("dto",forumDTO);
		mv.setViewName("forum/detail");
		
		return mv;
	}
	
	@RequestMapping(value="add", method = RequestMethod.GET)
	public ModelAndView add() throws Exception{
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("forum/add");
		return mv;
	
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
	public String update(ShopQnaDTO shopQnaDTO, Model model) throws Exception{
		ForumDTO forumDTO= shopQnaService.detail(shopQnaDTO);
		model.addAttribute("dto", shopQnaDTO);
		return "forum/update";
	}
	
	@RequestMapping(value="update", method = RequestMethod.POST)
	public String update(ShopQnaDTO shopQnaDTO) throws Exception{
		int result = shopQnaService.update(shopQnaDTO);
		return "redirect:./list";
	}
	
	@RequestMapping(value="reply", method = RequestMethod.GET)
	public ModelAndView reply(ShopQnaDTO shopQnaDTO, ModelAndView mv) throws Exception{
		mv.addObject("dto",shopQnaDTO);
		mv.setViewName("forum/reply");
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
