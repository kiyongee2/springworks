package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.BoardVO;

//DAO 역할
public interface BoardMapper {
	
	public List<BoardVO> getBoardList(); //글 목록 보기
	
	public void insertBoard(BoardVO vo);  //글쓰기
	
	public BoardVO getBoard(int bno);  //글 상세 보기
}
