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
	
	// list
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list(Model model) throws Exception {
		List<BoardDTO> ar = boardService.list();
		model.addAttribute("list", ar);
		
		return "board/list";
	}
	
	// detail
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String detail(BoardDTO boardDTO, Model model) throws Exception {
		boardDTO = boardService.detail(boardDTO);
		model.addAttribute("dto", boardDTO);
		
		return "board/detail";
	}
	
	// insert jsp page 이동
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void add() throws Exception {}
	
	// DB Insert
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public String add(BoardDTO boardDTO) throws Exception {
		int result = boardService.add(boardDTO);
		
		return "redirect:./list";
	}
	
	// update
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public void update(BoardDTO boardDTO, Model model) throws Exception {
		boardDTO = boardService.detail(boardDTO);
		model.addAttribute("dto", boardDTO);
	}
	
	// DB Update
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String update(BoardDTO boardDTO) throws Exception {
		int result = boardService.update(boardDTO);
		
		return "redirect:./list";
	}
	
	// delete
	@RequestMapping(value = "delete", method = RequestMethod.GET)
	public String delete(BoardDTO boardDTO) throws Exception {
		int result = boardService.delete(boardDTO);
		
		return "redirect:./list";
	}

}
