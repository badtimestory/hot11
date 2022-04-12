package com.shop.s1.product;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.shop.s1.util.FileManager;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private FileManager fileManager;
	
	// list
	public List<ProductDTO> list() throws Exception{
		return productDAO.list();
	}
	
	// detail
	public ProductDTO detail(ProductDTO productDTO) throws Exception {
		return productDAO.detail(productDTO);
	}
	
	// insert
	public int add(ProductDTO productDTO, MultipartFile photo) throws Exception {
		int result = productDAO.add(productDTO);
		
		// 1. 파일을 HDD 저장
		String fileName = fileManager.save(photo, "resources/images/products/");
			
		// 2. 파일정보를 DB에 저장
		ProductFileDTO productFileDTO = new ProductFileDTO();
		productFileDTO.setP_num(productDTO.getP_num());
		productFileDTO.setPf_fileName(fileName);
		productFileDTO.setPf_oriName(photo.getOriginalFilename());
		result = productDAO.addFile(productFileDTO);
		
		return result;
	}
	
	// update
	public int update(ProductDTO productDTO) throws Exception {
		return productDAO.update(productDTO);
	}
	
	// delete
	public int delete(ProductDTO productDTO) throws Exception {
		// 글 번호로 HDD에 저장된 파일명 조회
		ProductFileDTO pf = productDAO.lookUpFile(productDTO);
		
		// 글은 존재하는데 이미지가 없으면 삭제 가능하게 처리
		if(pf == null) {
			return productDAO.delete(productDTO);
		} else {
			System.out.println("delete 메서드: " + pf.getPf_fileName());			
		}
		
		int result = productDAO.delete(productDTO);
		System.out.println("삭제실행 체크: " + result);
		
		if(result > 0) {
			boolean check = fileManager.remove("/resources/images/products/", pf.getPf_fileName());
			System.out.println("파일삭제 체크: " + check);
		} 
		
		return result;
	}
	
	// delete file
	public int fileDelete(ProductFileDTO productFileDTO) throws Exception {
		
		// HDD에 존재하는 파일을 삭제함
		fileManager.remove("/resources/images/products/", productFileDTO.getPf_fileName());
		
		return productDAO.fileDelete(productFileDTO);
	}
}
