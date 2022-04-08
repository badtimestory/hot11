package com.shop.s1.product;

public class ProductFileDTO {
	
	private Long pf_num;			// 파일 번호
	private Long p_num;				// 글 번호
	private String pf_fileName;		// 파일 이름
	private String pf_oriName;		// 원본파일 이름
	
	
	

	
	public Long getPf_num() {
		return pf_num;
	}
	public void setPf_num(Long pf_num) {
		this.pf_num = pf_num;
	}
	public Long getP_num() {
		return p_num;
	}
	public void setP_num(Long p_num) {
		this.p_num = p_num;
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
