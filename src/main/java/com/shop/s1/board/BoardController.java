package com.shop.s1.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("board/*")
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		
		List<BoardDTO> ar = boardService.list();
		model.addAttribute("list", ar);
		
		return "board/list";
		
	}

}
