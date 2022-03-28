package com.shop.s1.forum.review;

import java.sql.Date;

import com.shop.s1.forum.ForumDTO;

public class ReviewDTO extends ForumDTO {

	private Long p_num;
	private Long o_num;
	private String m_id;
	
	public Long getP_num() {
		return p_num;
	}
	public void setP_num(Long p_num) {
		this.p_num = p_num;
	}
	public Long getO_num() {
		return o_num;
	}
	public void setO_num(Long o_num) {
		this.o_num = o_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}	
}
