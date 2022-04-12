package com.shop.s1.cart;


import java.sql.Date;
import java.util.List;

import com.shop.s1.memberJoin.MemberJoinDTO;
import com.shop.s1.product.ProductDTO;
import com.shop.s1.wishlist.WishlistListDTO;
import com.shop.s1.product.ProductFileDTO;


public class CartListDTO {
	
	private Long c_num;    //장바구니 번호
	private String m_id;   //회원 아이디
	private Long p_num;    //상품 번호
	private Long t_num;    //카테고리 번호
	private Long c_stock;  
	private Date addDate;
	
	//product
	private Long num;  
	private String p_name;
	private Long p_price;
	
	//productfileDTO
	private List<CartFileDTO> fileDTOs;
	private MemberJoinDTO memberJoinDTO;
	private Long pf_num;			// 파일 번호
	private String pf_fileName;		// 파일 이름
	private String pf_oriName;		// 원본파일 이름
	
	

	
	public List<CartFileDTO> getFileDTOs() {
		return fileDTOs;
	}
	public void setFileDTOs(List<CartFileDTO> fileDTOs) {
		this.fileDTOs = fileDTOs;
	}
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
	public Long getC_stock() {
		return c_stock;
	}
	public void setC_stock(Long c_stock) {
		this.c_stock = c_stock;
	}
	public Date getAddDate() {
		return addDate;
	}
	public void setAddDate(Date addDate) {
		this.addDate = addDate;
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
	
	public MemberJoinDTO getMemberJoinDTO() {
		return memberJoinDTO;
	}
	public void setMemberJoinDTO(MemberJoinDTO memberJoinDTO) {
		this.memberJoinDTO = memberJoinDTO;
	}
	

	public Long getPf_num() {
		return pf_num;
	}
	public void setPf_num(Long pf_num) {
		this.pf_num = pf_num;
	}
	public String getPf_fileName() {
		return pf_fileName;
	}
	public void setPf_fileName(String pf_fileName) {
		this.pf_fileName = pf_fileName;
	}
	public String getPf_oriName() {
		return pf_oriName;
	}
	public void setPf_oriName(String pf_oriName) {
		this.pf_oriName = pf_oriName;
	}
	
	

	
	
}
