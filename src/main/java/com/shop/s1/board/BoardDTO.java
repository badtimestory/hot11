package com.shop.s1.board;

public class BoardDTO {
	// 글 번호
	private Long b_num;
	// 제목
	private String b_title;
	// 내용
	private String b_contents;
	// 작성자
	private String b_writer;
	
	public Long getB_num() {
		return b_num;
	}
	public void setB_num(Long b_num) {
		this.b_num = b_num;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_contents() {
		return b_contents;
	}
	public void setB_contents(String b_contents) {
		this.b_contents = b_contents;
	}
	public String getB_writer() {
		return b_writer;
	}
	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}
	
	
	
	
}
