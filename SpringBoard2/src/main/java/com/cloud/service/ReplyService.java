package com.cloud.service;

import java.util.List;

import com.cloud.domain.ReplyVO;

public interface ReplyService {
	//´ñ±Û ¸ñ·Ï
	public List<ReplyVO> getReplyList(int bno);
}
