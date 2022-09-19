package com.cloud.mapper;

import java.util.List;

import com.cloud.domain.ReplyVO;

public interface ReplyMapper {
	
	//댓글 목록 보기
	List<ReplyVO> getReplyList(int bno);
}
