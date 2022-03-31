package com.shop.s1.cart;


import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.product.ProductDTO;

public class CartListDTO {
	
	private Long c_num;    //장바구니 번호
	private String m_id;   //회원 아이디
	private Long p_num;    //상품 번호
	private Long t_num;    //카테고리 번호
	private Long c_amount; //총금액 

	//product
	private Long num;  //이게 왜 들어갈까
	private String p_name;
	private Long p_price;
	
	private ProductDTO productDTO;
	private MemberJoinDTO memberJoinDTO;
	
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
	public ProductDTO getProductDTO() {
		return productDTO;
	}
	public void setProductDTO(ProductDTO productDTO) {
		this.productDTO = productDTO;
	}
	public MemberJoinDTO getMemberJoinDTO() {
		return memberJoinDTO;
	}
	public void setMemberJoinDTO(MemberJoinDTO memberJoinDTO) {
		this.memberJoinDTO = memberJoinDTO;
	}
	public Long getNum() {
		return num;
	}
	public void setNum(Long num) {
		this.num = num;
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
	
	
	

	
	
}
