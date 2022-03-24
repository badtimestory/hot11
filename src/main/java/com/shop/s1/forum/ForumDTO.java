package com.shop.s1.forum;

import java.sql.Date;

public class ForumDTO {
	
	private Long num;				// 글번호
	private String title;			// 제목
	private String contents;		// 내용
	private String writer;			// 작성자
	private Date regDate;			// 날짜
	private Long Hit;				// 추천수

	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContents() {
		return contents;
	}
	public void setContents(String contents) {
		this.contents = contents;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public Long getHit() {
		return Hit;
	}
	public void setHit(Long hit) {
		Hit = hit;
	}
}
