package com.cloud.service;

import java.util.List;

import com.cloud.domain.BoardVO;

public interface BoardService {
	
	public List<BoardVO> getBoardList(); //글 목록 보기
}
