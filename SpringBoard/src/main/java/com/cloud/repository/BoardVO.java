package com.cloud.repository;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardVO {
	private int bno;         //글번호
	private String title;    //제목
	private String writer;   //작성자
	private String content;  //내용
	private Date regDate;    //작성일
	private int cnt;         //조회수
	
}
