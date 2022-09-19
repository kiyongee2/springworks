package com.cloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cloud.domain.ReplyVO;
import com.cloud.mapper.ReplyMapper;

@Service
public class ReplyServiceImpl implements ReplyService{
	
	//���� �������̽� ����(DI) - ��ü(Bean) ������
	@Autowired
	private ReplyMapper replyMapper;

	//��� ���
	@Override
	public List<ReplyVO> getReplyList(int bno) {
		return replyMapper.getReplyList(bno);
	}

}
