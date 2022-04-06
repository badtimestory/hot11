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
		return productDAO.delete(productDTO);
	}
}
