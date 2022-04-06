package com.shop.s1.wishlist;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.product.ProductDTO;

public class WishlistListDTO {

	private Long w_num;
	private String m_id;
	private Long p_num;
	private Long t_num;
	
	private Long num;
	private String p_name;
	private Long p_price;
	
	private ProductDTO productDTO;
	private MemberJoinDTO memberJoinDTO;
	
	public Long getW_num() {
		return w_num;
	}
	public void setW_num(Long w_num) {
		this.w_num = w_num;
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
	
	
}