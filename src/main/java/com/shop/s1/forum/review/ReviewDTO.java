package com.shop.s1.forum.review;

import java.sql.Date;

import com.shop.s1.forum.ForumDTO;

public class ReviewDTO extends ForumDTO {

	private Long p_num;		// 상품번호
	private Long o_num;		// 주문번호
	private Long t_num;		// 카테고리번호
	private String m_id;	// 아이디
	
	private Long ref;
	private Long step;
	private Long depth;
	
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
	public Long getT_num() {
		return t_num;
	}
	public void setT_num(Long t_num) {
		this.t_num = t_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	public Long getStep() {
		return step;
	}
	public void setStep(Long step) {
		this.step = step;
	}
	public Long getDepth() {
		return depth;
	}
	public void setDepth(Long depth) {
		this.depth = depth;
	}
	
	
}
