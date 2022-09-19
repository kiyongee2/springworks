package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.domain.ReplyVO;
import com.cloud.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	//매퍼 인터페이스 주입(DI) - 객체(Bean) 생성됨
	@Autowired
	private ReplyMapper replyMapper;

	//댓글 목록
	@Override
	public List<ReplyVO> getReplyList(int bno) {
		return replyMapper.getReplyList(bno);
	}

}
