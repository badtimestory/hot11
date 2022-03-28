package com.shop.s1.cart;

public class CartDTO {
	
	private Long c_num;
	private String m_id;
	private Long p_num;
	private Long t_num;
	private Long c_amount;
	
	//product
	private String p_name;
	private Long p_price;
	private Long p_count;
	//판매가 * 수량 = 합계 
	
	
	public Long getC_num() {
		return c_num;
	}
	public void setC_num(Long c_num) {
		this.c_num = c_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public Long getP_num() {
		return p_num;
	}
	public void setP_num(Long p_num) {
		this.p_num = p_num;
	}
	public Long getT_num() {
		return t_num;
	}
	public void setT_num(Long t_num) {
		this.t_num = t_num;
	}
	public Long getC_amount() {
		return c_amount;
	}
	public void setC_amount(Long c_amount) {
		this.c_amount = c_amount;
	}
	
	
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public Long getP_price() {
		return p_price;
	}
	public void setP_price(Long p_price) {
		this.p_price = p_price;
	}
	public Long getP_count() {
		return p_count;
	}
	public void setP_count(Long p_count) {
		this.p_count = p_count;
	}
	

	
	
}
