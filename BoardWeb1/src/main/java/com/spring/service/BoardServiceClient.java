package com.spring.service;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.spring.board.BoardDAO;
import com.spring.board.BoardVO;

public class BoardServiceClient {

	public static void main(String[] args) {
		//1. spring 컨테이너 구동
		AbstractApplicationContext container =
				new GenericXmlApplicationContext("applicationContext.xml");
		
		//2. BoardDAO 처리 -> BoardService 처리
		//BoardDAO boardDAO = (BoardDAO) container.getBean("boardDAO");
		BoardService boardService = 
				(BoardService) container.getBean("boardService");
		
		//글쓰기
		BoardVO vo = new BoardVO();
		vo.setTitle("가을6");
		vo.setWriter("오상식");
		vo.setContent("가을이 오고 있어요");
		//boardDAO.insertBoard(vo);
		boardService.insertBoard(vo);
	
		//글 목록
		//List<BoardVO> boardList = boardDAO.getBoardList();
		List<BoardVO> boardList = boardService.getBoardList();
		for(BoardVO board : boardList) {
			System.out.println("--->" + board.toString());
		}
		
		//3. spring 컨테이너 종료
		container.close();
	}
}
