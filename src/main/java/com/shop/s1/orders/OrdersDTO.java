package com.shop.s1.orders;

import java.sql.Date;
import java.util.List;

import com.shop.s1.cart.CartDTO;

public class OrdersDTO {
	
	private Long o_num;
	private String m_id;
	private Long p_num;
	private Long c_num;
	private String o_name;
	private Date o_date;
	private String o_phone;
	private String o_address;
	private Long o_amount;
	private Long o_price;
	private String o_message;
	private String o_pay;
	
	private List<CartDTO> cartDTOs;
	
	//product
	private String p_name;
	private Long p_price;
	private Long p_count;
	
	
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
	
	
	public List<CartDTO> getCartDTOs() {
		return cartDTOs;
	}
	public void setCartDTOs(List<CartDTO> cartDTOs) {
		this.cartDTOs = cartDTOs;
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
	public Long getP_num() {
		return p_num;
	}
	public void setP_num(Long p_num) {
		this.p_num = p_num;
	}
	public Long getC_num() {
		return c_num;
	}
	public void setC_num(Long c_num) {
		this.c_num = c_num;
	}
	public String getO_name() {
		return o_name;
	}
	public void setO_name(String o_name) {
		this.o_name = o_name;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	public String getO_phone() {
		return o_phone;
	}
	public void setO_phone(String o_phone) {
		this.o_phone = o_phone;
	}
	public String getO_address() {
		return o_address;
	}
	public void setO_address(String o_address) {
		this.o_address = o_address;
	}
	public Long getO_amount() {
		return o_amount;
	}
	public void setO_amount(Long o_amount) {
		this.o_amount = o_amount;
	}
	public Long getO_price() {
		return o_price;
	}
	public void setO_price(Long o_price) {
		this.o_price = o_price;
	}
	public String getO_message() {
		return o_message;
	}
	public void setO_message(String o_message) {
		this.o_message = o_message;
	}
	public String getO_pay() {
		return o_pay;
	}
	public void setO_pay(String o_pay) {
		this.o_pay = o_pay;
	}
	
	

	
	
	
	

}
