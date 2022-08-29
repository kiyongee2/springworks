package com.cloud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cloud.domain.BoardVO;
import com.cloud.service.BoardService;

@RequestMapping("/board/*")  //localhost:8080/board/aaa
@Controller
public class BoardController {
	
	@Autowired
	private BoardService service;

	//��� ����
	@GetMapping("/boardList")//localhost:8080/board/boardList
	public String getBoardList(Model model) {
		List<BoardVO> boardList = service.getBoardList();
		model.addAttribute("boardList", boardList); //view�� ����
		return "/board/boardList";
	}
	
	//�۾��� �� ������ ��û
	@GetMapping("/insertBoard")
	public String insertBoard() {
		return "/board/insertBoard";
	}
	
	//�۾��� ó�� ��û
	@PostMapping("/insertBoard")
	public String insertBoard(BoardVO vo) {
		service.insertBoard(vo);      
		return "redirect:/board/boardList";
	}
	
	//�� �󼼺��� ó��
	@GetMapping("/boardView")
	public String getBoard(int bno, Model model) {
		BoardVO board = service.getBoard(bno);
		model.addAttribute("board", board);  //model="board" ������
		return "/board/boardView";
	}
	
}
