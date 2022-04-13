package com.shop.s1.forum.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.s1.forum.ForumDTO;
import com.shop.s1.util.Pager;

@Controller
@RequestMapping("review/*")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	@ModelAttribute("forum")
	public String forum() {
		return "review";
	}
	
	// List
	@GetMapping("list")
	public String list(Pager pager, Model model) throws Exception {
		List<ForumDTO> ar = reviewService.list(pager);
		model.addAttribute("list", ar);
		
		return "forum/list";
	}
	
	// Detail
	@GetMapping("detail")
	public String detail(ReviewDTO reviewDTO, Model model) throws Exception {
		ForumDTO forumDTO = reviewService.detail(reviewDTO);
		model.addAttribute("dto", forumDTO);
		
		return "forum/detail";
	}
	
	// Insert
	@GetMapping("add")
	public String add() throws Exception {
		
		return "forum/add";
	}
	
	// Insert DB
	@PostMapping("add")
	public String add(ReviewDTO reviewDTO) throws Exception {
		int result = reviewService.add(reviewDTO);
		
		return "redirect:./list";
	}
	
	// Update
	@GetMapping("update")
	public String update(ReviewDTO reviewDTO, Model model) throws Exception {
		ForumDTO forumDTO = reviewService.detail(reviewDTO);
		model.addAttribute("dto", forumDTO);
		
		return "forum/update";
	}
	
	// Update DB
	@PostMapping("update")
	public String update(ReviewDTO reviewDTO) throws Exception {
		int result = reviewService.update(reviewDTO);
		
		return "redirect:./list";
	}
	
	// Delete
	@GetMapping("delete")
	public String delete(ReviewDTO reviewDTO) throws Exception {
		int result = reviewService.delete(reviewDTO);
		
		return "redirect:./list";
	}
	
	// Reply
	@GetMapping("reply")
	public String reply(ReviewDTO reviewDTO, Model model) throws Exception {
		model.addAttribute("dto", reviewDTO);
		
		return "forum/reply";
	}
	
	// Reply DB
	@PostMapping("reply")
	public String reply(ReviewDTO reviewDTO) throws Exception {
		
		int result = reviewService.reply(reviewDTO);
		
		return "redirect:./list";
	}
	

}
