package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cloud.domain.ReplyVO;
import com.cloud.mapper.BoardMapper;
import com.cloud.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	//매퍼 인터페이스 주입(DI) - 객체(Bean) 생성됨
	@Autowired
	private ReplyMapper replyMapper;
	
	@Autowired
	private BoardMapper boardMapper;

	//댓글 목록
	@Override
	public List<ReplyVO> getReplyList(int bno) {
		return replyMapper.getReplyList(bno);
	}

	//댓글 등록 - 댓글 개수 저장, 트랜잭션: 작업 완벽하게 완료되지 않으면 취소함
	//댓글 등록하면 댓글 개수가 증가함
	@Transactional 
	@Override
	public void register(ReplyVO vo) {
		//댓글 개수
		boardMapper.updateReplyCnt(vo.getBno(), 1); //1-amount 임
		replyMapper.register(vo);
	}

}
