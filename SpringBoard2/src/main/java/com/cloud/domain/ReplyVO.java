package com.cloud.domain;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReplyVO {
	
	private int rno;    //댓글 번호(기본키)
	private int bno;    //게시글 번호
	
	private String reply;    //댓글 내용
	private String replyer;  //댓글 작성자
	private Date replyDate;  //댓글 작성일
	private Date updateDate; //댓글 수정일
}
