package com.cloud.service;

import java.util.List;

import com.cloud.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList(); //글 목록 보기
	
	public void insertBoard(BoardVO vo);  //글쓰기
	
	public BoardVO getBoard(int bno);  //글 상세 보기
}
