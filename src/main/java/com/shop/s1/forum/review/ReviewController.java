package com.shop.s1.forum.review;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.shop.s1.forum.ForumDTO;

@Controller
@RequestMapping("review/*")
public class ReviewController {
	
	@Autowired
	private ReviewService reviewService;
	
	// List
	@GetMapping("list")
	public String list(Model model) throws Exception {
		List<ForumDTO> ar = reviewService.list();
		model.addAttribute("list", ar);
		
		return "review/list";
	}
	
	// Detail
	@GetMapping("detail")
	public String detail(ReviewDTO reviewDTO, Model model) throws Exception {
		ForumDTO forumDTO = reviewService.detail(reviewDTO);
		model.addAttribute("detail", forumDTO);
		
		return "review/detail";
	}
	
	// Insert
	@GetMapping("add")
	public void add() throws Exception {}
	
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
		model.addAttribute("update", forumDTO);
		
		return "review/update";
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
		model.addAttribute("reply", reviewDTO);
		
		return "review/reply";
	}
	
	// Reply DB
	@PostMapping("reply")
	public String reply(ReviewDTO reviewDTO) throws Exception {
		
		int result = reviewService.reply(reviewDTO);
		
		return "redirect:./list";
	}
	

}
